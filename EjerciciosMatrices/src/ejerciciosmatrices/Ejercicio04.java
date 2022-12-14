/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmatrices;

/**
 *
 * @author pabmar
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        int orden = 5;
        int[][] matriz = new int[orden][orden];
        
        int contador = 1;
        
//        Generar en cuadrado Latino de orden N. (Un cuadrado Latino de orden N es una matriz cuadrada en la que la primera fila contiene los N
//        primeros números naturales, en orden, y cada una de las siguientes filas contiene la rotación de la fila anterior un lugar a la derecha.
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = orden + (i+j);
            }
        }
        
        
        //        Toda la matriz
        System.out.println("Toda la matriz: ");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(" | ");
                System.out.print(matriz[x][y]);
                System.out.print(" | ");
            }
            System.out.println();
        }
        
    }
}
