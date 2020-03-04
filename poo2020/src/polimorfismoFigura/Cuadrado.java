package polimorfismoFigura;

public class Cuadrado extends Figura {
    private double ladoCuad;

    public double getLadoCuad() {
        return ladoCuad;
    }

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }
    @Override
    public void calcularArea(){
        area = ladoCuad*ladoCuad;
    }
}
