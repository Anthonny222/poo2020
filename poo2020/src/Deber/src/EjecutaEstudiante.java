import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del estudiante: ");
        String nombre = teclado.nextLine();
        System.out.println("Calificacion 1: ");
        double calf1 = teclado.nextDouble();
        System.out.println("Calificacion 2: ");
        double calf2 = teclado.nextDouble();
        System.out.println("Calificacion 3: ");
        double calf3 = teclado.nextDouble();
        System.out.println("Calificacion 4: ");
        double calf4 = teclado.nextDouble();

        Estudiante estudiante = new Estudiante();

        estudiante.setNombre(nombre);
        estudiante.setCalf1(calf1);
        estudiante.setCalf2(calf2);
        estudiante.setCalf3(calf3);
        estudiante.setCalf4(calf4);

        estudiante.calcularPromedio();
        estudiante.calcularComentario();

        System.out.println("Estudiante: "+ estudiante.getNombre());
        System.out.println("Promedio: "+ estudiante.getProme());

    }
}
