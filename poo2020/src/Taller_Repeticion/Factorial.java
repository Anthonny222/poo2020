package Taller_Repeticion;
/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */
public class Factorial {
    private int numero;
    private int resultado = 1;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void calcularFactorial(){
        for (int i = 1; i <= numero ; i++) {
            resultado = resultado * i;
        }
    }

    public Factorial(int num){
        numero = num;
    }
}
