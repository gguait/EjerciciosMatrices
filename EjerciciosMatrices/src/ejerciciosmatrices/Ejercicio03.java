/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmatrices;

/**
 *
 * @author pabmar
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        int[] vectorV = new int[50];
        int[] vectorP = new int[20];

//        Crea un vector V numérico de 50 elementos y otro P de 20 elementos.
        for (int i = 0; i < vectorV.length; i++) {
            vectorV[i] = (int) ((Math.random() * 9) + 1);
        }
        for (int i = 0; i < vectorP.length; i++) {
            vectorP[i] = (int) ((Math.random() * 9) + 1);
        }
        for (int i = 0; i < vectorV.length; i++) {
            System.out.print(" | " + vectorV[i] + " | ");
        }
        System.out.println();
        for (int i = 0; i < vectorP.length; i++) {
            System.out.print(" | " + vectorP[i] + " | ");
        }
        System.out.println();

//        Genera luego M(50,20) de tal forma que M(I,J) es igual a V(I) * P(J)
        int[][] matrizM = new int[vectorV.length][vectorP.length];
        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = vectorV[i] * vectorP[j];
            }
        }
        System.out.println("Toda la matriz: ");
        for (int x = 0; x < matrizM.length; x++) {
            for (int y = 0; y < matrizM[x].length; y++) {
                System.out.print(" | ");
                System.out.print(matrizM[x][y]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
