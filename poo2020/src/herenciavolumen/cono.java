package herenciavolumen;

public class cono extends figura{
    private double radio;
    private double altura;
    private double volumenCilindro;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumenCilindro() {
        return volumenCilindro;
    }

    public void setVolumenCilindro(double volumenCilindro) {
        this.volumenCilindro = volumenCilindro;
    }
    public void calcularVolumenCilindro(){
        volumenCilindro=((1/3)*(Math.PI*(Math.pow(radio,2))*altura));
    }
}
