import java.util.Scanner;

public class Ejecuta_Cedula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cedula;
        boolean valid;

        do {
            System.out.print("Ingrese número de cédula: ");
            cedula = scan.nextLine();
            valid = true;
            if(cedula.length() != 10){
                System.out.println("Número de cédula inválido, recuerde que un número de cédula contiene 10 dígitos.");
                valid = false;
            }
        } while (valid == false);

        Cedula id = new Cedula();
        id.setId(cedula);
    }
}
