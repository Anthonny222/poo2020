package polimorfismopoo;

import java.util.Scanner;

public class EjecutaEMpleado12 {
    public static void main(String[] args) {
        double horas;
        double cuora;
        EmpleadosPorHoras2 empleadosPorHoras2 = new EmpleadosPorHoras2();
        Scanner teclado = new Scanner(System.in);
        System.out.println("calculo suledo quincenal empleado por horas");
        System.out.println("Ingrese horas trabajadas");
        empleadosPorHoras2.setHoras_trabajadas(teclado.nextDouble());
        System.out.println("Ingrese la cuota por hora");
        empleadosPorHoras2.setCuotas_po_hora(teclado.nextDouble());
        empleadosPorHoras2.calcularSueldoQna();
        System.out.println("EL sueldo quincenal es: "+empleadosPorHoras2.getSueldo());
        System.out.println("calculo de sueldo quincenal de empleado asalariado");
        System.out.println("Ingrese sueldo mensual:");
        EmpleadoAsalariado2 empAs = new EmpleadoAsalariado2();
        empAs.setSueldo_mensual(teclado.nextDouble());
        empAs.calcularSueldoQna();
        System.out.println("el sueldo quincenal es:"+empAs.getSueldo());
    }

}
