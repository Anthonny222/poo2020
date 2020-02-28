package herenciafigura;

public class Triangulo extends Figura {
    protected double baseTrian;
    protected  double alturaTrian;
    protected double areaTrian;

    public double getBaseTrian() {
        return baseTrian;
    }

    public void setBaseTrian(double baseTrian) {
        this.baseTrian = baseTrian;
    }

    public double getAlturaTrian() {
        return alturaTrian;
    }

    public void setAlturaTrian(double alturaTrian) {
        this.alturaTrian = alturaTrian;
    }

    public void CalcularAreaTrian() {
        areaTrian=(baseTrian*alturaTrian)/2;

    }

    public double getAreaTrian() {
        return areaTrian;
    }
}
