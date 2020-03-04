package polimorfismoFigura;

public class Rectangulo extends Figura {
    private double baseRect;
    private double alturaREct;

    public double getBaseRect() {
        return baseRect;
    }

    public void setBaseRect(double baseRect) {
        this.baseRect = baseRect;
    }

    public double getAlturaREct() {
        return alturaREct;
    }

    public void setAlturaREct(double alturaREct) {
        this.alturaREct = alturaREct;
    }
    @Override
    public void calcularArea(){
        area = baseRect*alturaREct;
    }
}
