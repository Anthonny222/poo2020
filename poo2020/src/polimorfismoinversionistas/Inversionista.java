package polimorfismoinversionistas;

public abstract class Inversionista {
    protected int numCl;
    protected String nom;
    protected String numCu;
    protected double inve;
    protected int plazoInv;
    protected double intGanado;

    public int getNumCl() {
        return numCl;
    }

    public void setNumCl(int numCl) {
        this.numCl = numCl;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumCu() {
        return numCu;
    }

    public void setNumCu(String numCu) {
        this.numCu = numCu;
    }

    public double getInve() {
        return inve;
    }

    public void setInve(double inve) {
        this.inve = inve;
    }

    public int getPlazoInv() {
        return plazoInv;
    }

    public void setPlazoInv(int plazoInv) {
        this.plazoInv = plazoInv;
    }

    public double getIntGanado() {
        return intGanado;
    }

    public abstract void calcularIntGanado();
}
