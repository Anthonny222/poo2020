package herenciavolumen;

import java.util.Scanner;

public class Ejecutavolumen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera=true;
        double radio;
        double altura;
        double arista;
        while (bandera){
            System.out.println("ingrese el nombre de la figura para calcular su volumen:\ncubo \ncilindro \ncono \nesfera");
            String nombre = teclado.nextLine();
            switch (nombre){
                case "cubo":
                    cubo cubo = new cubo();
                    System.out.println("ingrese el valor de la arista");
                    arista =teclado.nextDouble();
                    cubo.setArista(arista);
            }
        }
    }
}
