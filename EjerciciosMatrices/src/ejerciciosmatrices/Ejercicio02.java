/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmatrices;

/**
 *
 * @author pabmar
 */
public class Ejercicio02 {
    public static void main(String[] args) {
//          Introduce una matriz de 7 x 5 y visualízala. A continuación:

        int[][] matriz = new int[7][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random() * 9) + 1);
            }
        }
        
//        Toda la matriz
        System.out.println("Toda la matriz: ");
        for (int x=0; x < matriz.length; x++){
            for (int y=0; y < matriz[x].length; y++){
            System.out.print(" | ");System.out.print (matriz[x][y]); System.out.print(" | ");
            }
            System.out.println();
        }
//          Crea una nueva matriz de 7 x 7 en donde las cinco primeras columnas sean las de la matriz origen
        
        int[][] matriz2 = new int[7][7];
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz2[j][i] = matriz[j][i];
            }
        }
        
        //          Guarda en la columna sexta la suma de las cinco anteriores
        
        int contadorSuma = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                contadorSuma = contadorSuma + matriz[i][j];
            }
            matriz2[i][5] = contadorSuma;
            contadorSuma = 0;
        }
        
        
        
//          Guarda en la columna séptima la media de las cinco primeras

        int contadorMedia = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                contadorMedia = contadorMedia + matriz[i][j];
            }
            matriz2[i][6] = (contadorMedia/5);
            contadorMedia = 0;
        }
        
        System.out.println("Toda la matriz: ");
        for (int x=0; x < matriz2.length; x++){
            for (int y=0; y < matriz2[x].length; y++){
            System.out.print(" | ");System.out.print (matriz2[x][y]); System.out.print(" | ");
            }
            System.out.println();
        }

    }
}
