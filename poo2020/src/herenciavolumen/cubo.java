package herenciavolumen;

public class cubo extends figura {
    private double arista;
    private double volumenArista;

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }
    public void calcularVolumenCubo(){
        volumenArista=(Math.pow(arista,3));
    }

    public double getVolumenArista() {
        return volumenArista;
    }

    public void setVolumenArista(double volumenArista) {
        this.volumenArista = volumenArista;
    }
}
