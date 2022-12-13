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
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = (int) ((Math.random() * 9) + 1);
            }
        }
//        Toda la matriz
        System.out.println("Toda la matriz: ");
        for (int[] matriz1 : matriz) {
            for (int y = 0; y < matriz1.length; y++) {
                System.out.print(" | ");
                System.out.print(matriz1[y]);
                System.out.print(" | ");
            }
            System.out.println();
        }
//          Crea una nueva matriz de 7 x 7 en donde las cinco primeras columnas sean las de la matriz origen

        int[][] matriz2 = new int[7][5];
        for (int[] matriz3 : matriz) {
            for (int j = 0; j < matriz3.length; j++) {
                matriz3[j] = (int) ((Math.random() * 9) + 1);
            }
        }
//          Guarda en la columna sexta la suma de las cinco anteriores
//          Guarda en la columna séptima la media de las cinco primeras

    }
}
