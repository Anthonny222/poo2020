package intropoo;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = scan.nextLine();

        System.out.println("Materia: ");
        String materia = scan.nextLine();

        System.out.println("Nota bimestre 1: ");
        Double notaB1 = scan.nextDouble();

        System.out.println("Nota bimestre 2: ");
        Double notaB2 = scan.nextDouble();

        System.out.println("_________________________________________");
        Estudiante estudiante = new Estudiante(nombre, materia, notaB1, notaB2);
        System.out.println(estudiante.getEstudiante());
        System.out.println(estudiante.getNotaF(notaB1, notaB2));
        System.out.println("_________________________________________");
    }
    }
