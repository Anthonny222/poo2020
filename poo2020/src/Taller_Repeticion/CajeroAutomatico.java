package Taller_Repeticion;

/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */

public class CajeroAutomatico {
    private String nombre;
    private double saldo_inicial;
    private double retiro;
    private double deposito;
    private double saldo_final;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo_inicial() {
        return saldo_inicial;
    }

    public void setSaldo_inicial(double saldo_inicial) {
        this.saldo_inicial = saldo_inicial;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getSaldo_final() {
        return saldo_final;
    }

    public void setSaldo_final(double saldo_final) {
        this.saldo_final = saldo_final;
    }

    public CajeroAutomatico (String nom, double saldo){
        nombre = nom;
        saldo_inicial = saldo;
    }

    public double calcularSaldo(int opcion, double cantidad){
        if(opcion==2){
            saldo_final = saldo_inicial + cantidad;
        } else {
            if(opcion==3){
                if(cantidad>saldo_inicial){
                    System.out.printf("No puede retirar mas dinero del que posee");
                } else{
                    saldo_final = saldo_inicial - cantidad;
                }
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
        return saldo_final;
    }
}
