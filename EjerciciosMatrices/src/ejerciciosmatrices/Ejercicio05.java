/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmatrices;

/**
 *
 * @author pabmar
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int[][] matrizA = new int[100][2];
        int[][] matrizB = new int[50][2];
        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int) ((Math.random() * 9) + 1);
            }
        }
        
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = (int) ((Math.random() * 9) + 1);
            }
        }
        
        
    }
}
