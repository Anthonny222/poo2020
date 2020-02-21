package matrizpoo;
import java.util.Scanner;

public class EjecutaMatrizAvanzada {
    public static void main(String[] args) {
        int[][]matrizOriginal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas que tendra su matriz:");
        int filas = teclado.nextInt();
        System.out.println("Ingrese la cantidad de columnas que tendra su matriz:");
        int columnas = teclado.nextInt();
        matrizOriginal = new int[filas][columnas];
        int [][] matrizTranspuesta;
        for (int f = 0; f <matrizOriginal.length ; f++) {
            for (int c = 0; c <matrizOriginal[f].length ; c++) {
                System.out.printf("Ingrese el valor de la matriz en la posicion (%d,%d):\n",f+1,c+1);
                matrizOriginal[f][c] = teclado.nextInt();
            }
        }
        MatrizAvanzada matrizAvanzada = new MatrizAvanzada();;
        matrizAvanzada.setC(columnas);
        matrizAvanzada.setF(filas);
        matrizAvanzada.setMatrizOriginal(matrizOriginal);
        String cadena = "Matriz Originial:\n";
        for (int i = 0; i <filas ; i++) {
            for (int j = 0; j <columnas ; j++) {
                cadena = String.format("%s%d\t\t",cadena,matrizOriginal[i][j]);
            }
            cadena = String.format("%s\n",cadena);
        }
        System.out.println(cadena);
        matrizTranspuesta = new int[filas][columnas];
        matrizTranspuesta = matrizAvanzada.calcularMatrizTranspuesta(matrizOriginal);

        String cadena2 = "Matriz Transpuesta:\n";
        for (int i = 0; i <columnas ; i++) {
            for (int j = 0; j <filas ; j++) {
                cadena2 = String.format("%s%d\t\t",cadena2,matrizTranspuesta[i][j]);
            }
            cadena2 = String.format("%s\n",cadena2);
        }

        System.out.println(cadena2);
    }
}
