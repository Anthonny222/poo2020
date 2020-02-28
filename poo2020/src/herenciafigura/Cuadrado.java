package herenciafigura;

public class Cuadrado extends Figura {
    protected double ladoCuadrado;
    protected double areaCuadrado;

    public double getLadoCuadrado() {
        return ladoCuadrado;
    }

    public void setLadoCuadrado(double ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }

    public void calcularAreaCuadrado() {
        areaCuadrado=ladoCuadrado*ladoCuadrado;

    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }
}
