package polimorfismovolumen;

public class Cono extends Figura {
    private double radio;
    private double altura;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public void calcularArea(){
        area =(Math.PI*(Math.pow(radio,2))* altura)/3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
