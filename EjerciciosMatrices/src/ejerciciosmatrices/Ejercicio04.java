/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmatrices;

import java.util.Arrays;

/**
 *
 * @author pabmar
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        int orden = 5;
        int[][] matriz = new int[orden][orden];
        
        
//        Generar en cuadrado Latino de orden N. (Un cuadrado Latino de orden N es una matriz cuadrada en la que la primera fila contiene los N
//        primeros números naturales, en orden, y cada una de las siguientes filas contiene la rotación de la fila anterior un lugar a la derecha.
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0) {
                    matriz[i][j] = j + 1;
                } else {
                    if (j == 0) {
                        matriz[i][j] = matriz[i-1][matriz[i].length - 1];
                    } else {
                        matriz[i][j] = matriz[i-1][j-1];
                    }
                }
                
//                System.out.print(matriz[i][j]+" \t");
            }
//            System.out.println();
        }
        
        
        //        Toda la matriz
        System.out.println("Toda la matriz: ");
//        for (int[] matriz1 : matriz) {
//            for (int y = 0; y < matriz1.length; y++) {
//                System.out.print(" | ");
//                System.out.print(matriz1[y]);
//                System.out.print(" | ");
//            }
//            System.out.println();
//        }
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        
    }
}
