package disenio_seleccion;

import java.util.Scanner;

public class Ejecuta_NumDia {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero del dia");
        int numDia = teclado.nextInt();
        NumDia numDia1 = new NumDia(numDia);
        String resultado = numDia1.calcularNombre(numDia);
        System.out.println(resultado);

    }
}
