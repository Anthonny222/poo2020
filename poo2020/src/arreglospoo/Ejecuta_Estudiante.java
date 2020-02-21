import java.util.Scanner;

public class Ejecuta_Estudiante {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String[] nombre = new String[5];
        int[] edad = new int[5];
        String[] univ = new String[5];
        String[] cell = new String[5];
        Estudiante estudia = new Estudiante();

        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ": ");
            System.out.print("Nombre: ");
            nombre[i] = escaner.nextLine();
            System.out.print("Edad: ");
            edad[i] = escaner.nextInt();
            escaner.nextLine();
            System.out.print("Iniciales de la universidad: ");
            univ[i] = escaner.nextLine().toLowerCase();
            System.out.print("Número de celular: ");
            cell[i] = escaner.nextLine();
        }
        estudia.setNombre(nombre);
        estudia.setEdad(edad);
        estudia.setUniversidad(univ);
        estudia.setCelular(cell);
        estudia.presentar();

        System.out.println(estudia.getSalida());
    }
}
