import java.util.Scanner;

public class EjecutaNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primer Numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Segundo Numero: ");
        int num2 = teclado.nextInt();
        System.out.println("Tercer Numero: ");
        int num3 = teclado.nextInt();
        System.out.println("Cuarto Numero: ");
        int num4 = teclado.nextInt();

        NúmeroMayor numeroMayor = new NúmeroMayor(num1, num2, num3, num4);

        numeroMayor.calcularMayor();

        System.out.println("El número mayor es: " + numeroMayor.getNumMayor());

    }
}
