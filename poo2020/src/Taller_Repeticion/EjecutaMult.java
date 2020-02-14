package Taller_Repeticion;
/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */
import java.util.Scanner;

public class EjecutaMult {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el número 1");
        int num1=teclado.nextInt();
        System.out.println("Ingrese el valor del segundo número");
        int num2=teclado.nextInt();
        multiplicacion_sumas multiplicar=new multiplicacion_sumas(num1,num2);
        multiplicar.multiplicarNumero(num1,num2);
        int cont=0;
        for (int i = 0; i <num2 ; i++) {

            cont=cont+num1;
            System.out.println(cont+" +");

        }
        System.out.println("La multiplicación es igual a: "+num1+" * "+num2+" = "+multiplicar.multiplicarNumero(num1,num2));



    }
}
