package herenciafigura;

public class Circulo extends Figura {
    protected double radioCircu;
    protected double areaCircu;

    public double getReadioCircu() {
        return radioCircu;
    }

    public void setReadioCircu(double readioCircu) {
        this.radioCircu = readioCircu;
    }

    public void calcularAreaCircu() {
        areaCircu=3.1415*(radioCircu*radioCircu);

    }

    public double getAreaCircu() {
        return areaCircu;
    }
}
