package matrizpoo;

import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3];
        Scanner tecla = new Scanner(System.in);
        System.out.println("ingrese los valor de la matriz A");
        for (int i = 0; i <matrizA.length ; i++) {
            for (int j = 0; j <matrizA.length ; j++) {
                matrizA[i][j]=tecla.nextInt();
            }
        }
        for (int i = 0; i <matrizB.length ; i++) {
            for (int j = 0; j <matrizB.length ; j++) {
                matrizB[i][j]=tecla.nextInt();
            }
        }
        matriz matriz = new matriz();
        matriz.setMatrizA(matrizA);
        matriz.setMatrizB(matrizB);
        matriz.sumamatrices();
        matrizC = matriz.getMatrizC();
        String cadena = "";
        for (int i = 0; i <matrizC.length ; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                cadena = String.format("%s%d\n",cadena,matrizC[i][j]);
            }
        }
        System.out.println(cadena);
    }
}
