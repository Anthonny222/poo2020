package polimorfismovolumen;

public class Cilindro extends Figura{
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
        area = (Math.PI*(Math.pow(radio,2))*Math.pow(altura,2));
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
