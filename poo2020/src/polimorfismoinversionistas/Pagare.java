package polimorfismoinversionistas;

public class Pagare extends Inversionista {
    private double intAnual;

    public Pagare(int numCl, String nom, String numCu, double inve, int plazoInv, double intAnual){
        this.numCl = numCl;
        this.nom = nom;
        this.numCu = numCu;
        this.inve = inve;
        this.plazoInv = plazoInv;
        this.intAnual = intAnual;
    }

    public double getIntAnual() {
        return intAnual;
    }

    @Override
    public void calcularIntGanado() {
        intGanado = inve * (intAnual / 100) * plazoInv;
    }
}
