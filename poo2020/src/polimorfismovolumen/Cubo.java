package polimorfismovolumen;

public class Cubo extends Figura {
    private double arista;

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }
    @Override
    public void calcularArea(){
        area = (Math.pow(arista,3));
    }
}
