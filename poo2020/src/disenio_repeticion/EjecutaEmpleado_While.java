package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleado_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el valor de la hora");
        int valorHora = teclado.nextInt();
        boolean nuevoEmpleado = true;
        while (nuevoEmpleado==true){
            System.out.println("Ingrese el nomber del empleado");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese las horas trabajadas");
            int horasTrabajadas = teclado.nextInt();
            Empleado empleado = new Empleado(nombre,horasTrabajadas);
            empleado.establecerValorHora (valorHora);
            empleado.calcularSueldo();
            System.out.println(empleado.obtnerNombre());
            System.out.println(empleado.obtenerSUeldo());
            System.out.println("Desea calcular otro empleado   si / no");
            String opcion = teclado.nextLine();
            if (opcion.equals("no"));{
                nuevoEmpleado=false;
            }
        }
    }
}
