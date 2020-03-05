package polimorfismoinversionistas;

public class CuentaMaestra extends Inversionista {

    public CuentaMaestra(int numCl, String nom, String numCu, double inve, int plazoInv){
        this.numCl = numCl;
        this.nom = nom;
        this.numCu = numCu;
        this.inve = inve;
        this.plazoInv = plazoInv;
    }

    public void calcularIntGanado() {
        if (inve >= 1000.00 && inve < 4000.00) {
            intGanado = plazoInv * (inve * 0.05);
        } else {
            if (inve >= 4000.00 && inve < 20000.00) {
                intGanado = plazoInv * (inve * 0.0515);
            } else {
                if (inve >= 20000.00 && inve < 100000.00) {
                    intGanado = plazoInv * (inve * 0.0525);
                } else {
                    if (inve >= 1000000.00 && inve < 500000.00) {
                        intGanado = plazoInv * (inve * 0.055);
                    } else {
                        if (inve >= 500000.00) {
                            intGanado = plazoInv * (inve * 0.0575);
                        }
                    }
                }
            }
        }
    }
}
