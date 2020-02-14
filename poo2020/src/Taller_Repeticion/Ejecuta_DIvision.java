package Taller_Repeticion;
/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */
import java.util.Scanner;

public class Ejecuta_DIvision {
    public static void main(String[] args) {
        int contador=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del dividendo");
        int dividendo = teclado.nextInt();
        System.out.println("Ingrese el valor del divisor");
        int divisor = teclado.nextInt();

        while(dividendo>0){
            Division division = new Division(dividendo,divisor);
            contador = contador +1 ;
            dividendo = dividendo - divisor;
            System.out.println(division.getDividendo());
            System.out.println(division.getDivisor());
            System.out.println("la division es "+contador);
        }
    }
}
