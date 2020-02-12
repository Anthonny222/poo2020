package disenio_seleccion;

import java.util.Scanner;

public class Ejecuta_Empleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del empleado");
        String nombre = teclado.nextLine();
        System.out.println("Horas Trabajadas");
        int horas= teclado.nextInt();
        System.out.println("Cuotas");
        double cuota = teclado.nextDouble();
        Empleado empleado = new Empleado(nombre,horas,cuota);
        String mensaje = empleado.presentar();
        System.out.println(mensaje);
    }
}
