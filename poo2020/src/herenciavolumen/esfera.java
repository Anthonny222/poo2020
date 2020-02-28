package herenciavolumen;

public class esfera extends figura {
    private double radio;
    private double volumenCilindro;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolumenCilindro() {
        return volumenCilindro;
    }

    public void setVolumenCilindro(double volumenCilindro) {
        this.volumenCilindro = volumenCilindro;
    }
    public void calcularVolumenCilindro(){
        volumenCilindro=((4/3)*(Math.PI*(Math.pow(radio,3))));
    }
}
