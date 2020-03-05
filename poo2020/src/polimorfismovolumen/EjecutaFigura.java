package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        while (bandera=true){
            int opcion;
            System.out.println("1. Cubo");
            System.out.println("2. Cilindro");
            System.out.println("3. Cono");
            System.out.println("4. Esfera");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    Cubo cubo = new Cubo();
                    System.out.println("Arista del cubo");
                    cubo.setArista(teclado.nextDouble());
                    System.out.println("El area es: "+cubo.getArea());
                    cubo.calcularArea();
                    break;
                case 2:
                    Cilindro cilindro = new Cilindro();
                    System.out.println("ingrese el radio");
                    cilindro.setRadio(teclado.nextDouble());
                    System.out.println("ingrese la altura:");
                    cilindro.setAltura(teclado.nextDouble());
                    System.out.println("El area es: "+cilindro.getArea());
                    cilindro.calcularArea();
                    break;
                case 3:
                    Cono cono = new Cono();
                    System.out.println("ingrese el radio");
                    cono.setRadio(teclado.nextDouble());
                    System.out.println("ingrese la altura:");
                    cono.setAltura(teclado.nextDouble());
                    System.out.println("El area es: "+cono.getArea());
                    cono.calcularArea();
                    break;
                case 4:
                    Esfera esfera = new Esfera();
                    System.out.println("Ingrese el radio");
                    esfera.setRadio(teclado.nextDouble());
                    System.out.println("El area es: "+esfera.getArea());
                    esfera.calcularArea();
                    break;
            }
        }
    }
}
