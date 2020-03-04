package polimorfismoFigura;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        System.out.println("Calcular el area del triangulo:");
        System.out.println("Ingrese la base del triangulo:");
        triangulo.setBaseTrian(teclado.nextDouble());
        System.out.println("Ingrese la altura del triangulo:");
        triangulo.setAlturaTri(teclado.nextDouble());
        triangulo.calcularArea();
        System.out.println("El area del triangulo es: "+triangulo.getArea());
        Cuadrado cuadrado = new Cuadrado();
        System.out.println("\nCalcular el area del cuadrado");
        System.out.println("Ingrese el lado del cuadrado:");
        cuadrado.setLadoCuad(teclado.nextDouble());
        cuadrado.calcularArea();
        System.out.println("El area del cuadrado es: "+cuadrado.getArea());
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Calcular el area del rectangulo");
        System.out.println("Ingrese la base del rectangulo:");
        rectangulo.setBaseRect(teclado.nextDouble());
        System.out.println("Ingrese la altura del rectangulo:");
        rectangulo.setAlturaREct(teclado.nextDouble());
        rectangulo.calcularArea();
        System.out.println("El area del rectangulo es: "+rectangulo.getArea());
        Circulo circulo = new Circulo();
        System.out.println("Calcular el area del circulo");
        System.out.println("Ingrese el valor del radio del circulo:");
        circulo.setRadio(teclado.nextDouble());
        circulo.calcularArea();
        System.out.println("El area del circulo es: "+circulo.getArea());
    }
}
