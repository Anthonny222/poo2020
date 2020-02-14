package Taller_Repeticion;
import java.util.Scanner;
/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */
public class EjecutarFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea calcular su factorial:");
        int numero = teclado.nextInt();
        Factorial factorial = new Factorial(numero);
        factorial.calcularFactorial();
        System.out.printf("El factorial de %d es %d",numero,factorial.getResultado());
    }
}
