/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosmatrices;

/**
 *
 * @author pabmar
 */
public class EjerciciosMatrices {

    public static void main(String[] args) {
        int[][] matriz = new int[5][7];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random() * (33 - 8)) + 8);
            }
        }
//        Toda la matriz
        System.out.println("Toda la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Fila " + i + " columna " + j + ": " + matriz[i][j]);
            }
        }
//        La fila cinco completa
        System.out.println("\nLa quinta fila: ");
        for (int j = 0; j < matriz[matriz.length - 1].length; j++) {
            System.out.println("Fila " + (matriz.length - 1) + " columna " + j + ": " + matriz[matriz.length - 1][j]);
        }

//        El elemento de la cuarta fila tercera columna y el elemento de la quinta fila tercera columna. 
//        Intercambiarlos el contenido de estos dos elementos y visualizarlos de nuevo
        System.out.println("El elemento de la cuarta fila tercera columna " + matriz[3][2]);
        System.out.println("El elemento de la quinta fila tercera columna " + matriz[4][2]);

        int aux = matriz[3][2];
        matriz[3][2] = matriz[4][2];
        matriz[4][2] = aux;

        System.out.println("El elemento de la cuarta fila tercera columna " + matriz[3][2]);
        System.out.println("El elemento de la quinta fila tercera columna " + matriz[4][2]);
        
//        La primera columna y la cuarta. Intercambiar el contenido de estas columnas y visualizarlas de nuevo
        System.out.print("Primera columna: ");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[0][i]+" ");
        }
        System.out.print("\nCuarta columna: ");
        for (int i = 0; i < matriz[3].length; i++) {
            System.out.print(matriz[3][i]+" ");
        }
//        La primera columna intercambiada
        for (int i = 0; i < matriz[0].length; i++) {
            aux = matriz[0][i];
            matriz[0][i] = matriz[3][i];
            matriz[3][i] = aux;
        }
        System.out.print("\nPrimera columna: ");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[0][i]+" ");
        }
        System.out.print("\nCuarta columna: ");
        for (int i = 0; i < matriz[3].length; i++) {
            System.out.print(matriz[3][i]+" ");
        }

    }

}
