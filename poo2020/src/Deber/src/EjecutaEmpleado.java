import java.util.Scanner;

public class EjecutaEmpleado {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Nombre del empleado: ");
            String nombre = teclado.nextLine();
            System.out.println("cuota por hora: ");
            double cuota = teclado.nextDouble();
            System.out.println("horas trabajadas: ");
            int horas = teclado.nextInt();

            Empleado empleado = new Empleado(nombre, cuota, horas);
            empleado.calcularSueldo();

            System.out.println("Nombre: "+ empleado.getNombre()+ "\nSueldo: "+ empleado.getSueldo());
        }

}
