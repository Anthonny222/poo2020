package polimorfismovolumen;

public class Esfera extends Figura {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public void calcularArea(){
        area = (4/3)*(Math.PI*(Math.pow(radio,3)));
    }
}
