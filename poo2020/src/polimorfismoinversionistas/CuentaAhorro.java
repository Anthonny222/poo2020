package polimorfismoinversionistas;

public class CuentaAhorro extends Inversionista {
    private double intAnual;
    private double saldo;

    public CuentaAhorro(int numCl, String nom, String numCu, double inve, double intAnual, int plazoInv,
                        double saldo){
        this.numCl = numCl;
        this.nom = nom;
        this.numCu = numCu;
        this.inve = inve;
        this.intAnual = intAnual;
        this.plazoInv = plazoInv;
        this.saldo = saldo;
    }

    public double getIntAnual() {
        return intAnual;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void calcularIntGanado() {
        intGanado = saldo;
        for(int i = 0; i < plazoInv; i++){
            intGanado += inve * 12;
            intGanado += intGanado * (intAnual / 100);
        }
        intGanado = intGanado - (inve + saldo);
    }
}
