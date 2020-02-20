package arreglospoo;
import java.util.Scanner;

public class EjecutaArray {
    public static void main(String[] args) {
        int [] vectorA = new int[10];
        int [] vectorB = new int[10];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los valores del vector A:");
        for (int i = 0; i <10 ; i++) {
            vectorA[i] = teclado.nextInt();
        }
        System.out.println("Ingrese los valores del vector B:");
        for (int i = 0; i <10 ; i++) {
            vectorB[i] = teclado.nextInt();
        }
        Array array = new Array(vectorA,vectorB);
        array.calcularSumatoriaProductos();
        System.out.println("\nVector A:\n");
        for (int i = 0; i <10 ; i++) {
            System.out.println(vectorA[i]);
        }
        System.out.println("\nVector B:\n");
        for (int i = 0; i <10 ; i++) {
            System.out.println(vectorB[i]);
        }
        System.out.printf("\nSumatoria de los productos: %d",array.getSumatoria_producto());

    }
}
