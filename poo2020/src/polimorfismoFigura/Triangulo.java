package polimorfismoFigura;

public class Triangulo extends Figura{
    private double baseTrian;
    private double alturaTri;


    public double getBaseTrian() {
        return baseTrian;
    }

    public void setBaseTrian(double baseTrian) {
        this.baseTrian = baseTrian;
    }

    public double getAlturaTri() {
        return alturaTri;
    }

    public void setAlturaTri(double alturaTri) {
        this.alturaTri = alturaTri;
    }
    @Override
    public void calcularArea(){
        area = (baseTrian*alturaTri)/2;
    }
}
