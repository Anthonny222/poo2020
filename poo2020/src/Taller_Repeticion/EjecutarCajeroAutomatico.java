package Taller_Repeticion;
import java.util.Scanner;
/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */
public class EjecutarCajeroAutomatico {
    public static void main(String[] args) {
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su saldo actual:");
        double saldo = teclado.nextDouble();
        CajeroAutomatico cajeroAutomatico = new CajeroAutomatico(nombre,saldo);
        while(bandera == true) {
            System.out.println("\t\tCAJERO AUTOMATICO\nOPCIONES:\nConsultar saldo actual: 1\nDepositar dinero: 2\n" +
                    "Retirar dinero: 3\nIngrese el numero de acuerdo a la opcion que desea realizar");
            int numero = teclado.nextInt();
            switch (numero) {
                case 1:
                    System.out.printf("Su saldo actual es de: %.2f\n", cajeroAutomatico.getSaldo_inicial());
                    teclado.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero que desea depositar:");
                    double deposito = teclado.nextDouble();
                    double saldo_final = cajeroAutomatico.calcularSaldo(2, deposito);
                    teclado.nextLine();
                    cajeroAutomatico.setSaldo_inicial(saldo_final);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dinero que desea retirar");
                    double retiro = teclado.nextDouble();
                    double saldo_final2 = cajeroAutomatico.calcularSaldo(3, retiro);
                    teclado.nextLine();
                    cajeroAutomatico.setSaldo_inicial(saldo_final2);
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
            System.out.println("Desea realizar otra consulta?");
            String opcion = teclado.nextLine();
            if(opcion.equals("no")){
                bandera = false;
            }
        }
    }
}
