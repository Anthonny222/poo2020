package arreglospoo;
import java.util.Scanner;
/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */
public class EjecutaSumaArreglos {
    public static void main(String[] args) {
        int [] vector1 = new int[10];
        int [] vector2 = new int[10];

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los valores del vector 1:");
        for (int i = 0; i <10 ; i++) {
            vector1[i] = teclado.nextInt();
        }
        System.out.println("Ingrese los valores del vector 2:");
        for (int i = 0; i <10 ; i++) {
            vector2[i] = teclado.nextInt();
        }
        SumaArreglos sumaArreglos = new SumaArreglos(vector1,vector2);
        sumaArreglos.calcularVector3(vector1,vector2);
        int [] vector3 = sumaArreglos.getVector3();
        String cadena = "Arreglo 1\t+\tArreglo 2\t=\tArreglo3\n---------------------------------------\n";
        for (int i = 0; i <10 ; i++) {
            cadena = String.format("%s\t%d\t\t|\t\t%d\t\t|\t\t%d\n",cadena, vector1[i],vector2[i],vector3[i]);
        }
        System.out.println(cadena);
    }
}
