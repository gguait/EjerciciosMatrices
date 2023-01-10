/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmatrices;

/**
 *
 * @author pabmar
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        int[][] matriz = new int[22][4];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) ((Math.random() * 9) + 1);
            }
        }
        
//        for (int i = 0; i < matriz.length; i++) {
//            System.out.println("Alumno "+(i+1)+"\t "+matriz[i][0]+" "+matriz[i][1]+" "+matriz[i][2]);
//        }
        int mediaAlumno = 0;
        for (int i = 0; i < matriz.length; i++) {
            mediaAlumno = (matriz[i][0] + matriz[i][1] + matriz[i][2]) / 3;
            matriz[i][3] = mediaAlumno;
            mediaAlumno = 0;
        }
        
        for (int x=0; x < matriz.length; x++){
            for (int y=0; y < matriz[x].length; y++){
            System.out.print(" | ");System.out.print (matriz[x][y]); System.out.print(" | ");
            }
            System.out.println();
        }
        
        
//        System.out.println("\t \t 6");
    }
}
