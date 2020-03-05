package polimorfismodeudores;

public class Prestamo extends ClienteDeudor {

    public Prestamo(int numCl, String cliente, String numCue, double prestamo, double interes, int plazo){
        this.numCl = numCl;
        this.cliente = cliente;
        this.numCue = numCue;
        this.prestamo = prestamo;
        this.interes = interes;
        this.plazo = plazo;
    }

    @Override
    public void calcularPagar(){
        pagar = prestamo + plazo * (prestamo * interes / 100);
    }
}
