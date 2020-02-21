package matrizpoo;
/**
 * RamiroQuezada, Daniel Medina, Ian Ortega, Anthonny Espinosa
 */
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class EjecutaPromedio {
    public static void main(String[] args) {
        int lim = 0;
        int sum ;
        int prom;
        Promedio promedio=new Promedio();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese limite del arreglo");
        lim=teclado.nextInt();
        promedio.setLim(lim);
        int [][] ma=new int[lim][lim];
        System.out.println("Ingrese los datos del arreglo");
        for (int i = 0; i <lim ; i++) {
            for (int j = 0; j <lim ; j++) {
                ma[i][j] = teclado.nextInt();

            }
        }
        for (int i = 0; i <lim ; i++) {
            for (int j = 0; j <lim ; j++) {
                System.out.println(ma[i][j]);

            }

        }

        promedio.setMatrizA(ma);


        System.out.println(promedio.getSuma());
        System.out.println(promedio.getPromedio());


    }
}





