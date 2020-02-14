package Taller_Repeticion;
/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */

public class Division {
    private int dividendo;
    private int divisor;
    private int resultado;
    private int contador;
    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
    public Division (int divdo, int divor){
        dividendo = divdo;
        divisor = divor;
    }
    public void establecerdividendo(int divdo){
        dividendo=divdo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
