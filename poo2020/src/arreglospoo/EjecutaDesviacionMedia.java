package arreglospoo;
import java.util.Scanner;
/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */

public class EjecutaDesviacionMedia {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero1[]=new int[15];
        int numero2[]=new int[15];
        double desv[]=new double[15];
        int i;
        int desviacion;

        DesviacionMedia objNumeros=new DesviacionMedia();
        for ( i = 0; i <=14 ; i++) {
            System.out.println("Escriba un numero");
            numero1[i]=teclado.nextInt();

        }
        objNumeros.setNumero(numero1);
        objNumeros.calcular_media();
        objNumeros.calcular_desviacion();

        numero2=objNumeros.getNumero();
        desv=objNumeros.getDesviacion();


        for ( i = 0; i <14 ; i++) {

            System.out.println("La desviacion del numero: "+numero2[i]+" es: " +desv[i]);
            
        }
        System.out.println("La media es: "+objNumeros.getMedia());

    }
}
