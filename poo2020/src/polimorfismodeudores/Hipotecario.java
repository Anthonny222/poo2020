package polimorfismodeudores;

public class Hipotecario extends ClienteDeudor {

    public Hipotecario(int numCl, String cliente, String numCue, double prestamo, double interes, int plazo){
        this.numCl = numCl;
        this.cliente = cliente;
        this.numCue = numCue;
        this.prestamo = prestamo;
        this.interes = interes;
        this.plazo = plazo;
    }

    @Override
    public void calcularPagar(){
        pagar = prestamo * (interes / 100);
    }
}
