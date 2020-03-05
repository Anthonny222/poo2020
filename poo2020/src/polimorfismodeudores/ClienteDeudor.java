package polimorfismodeudores;

public abstract class ClienteDeudor {
    protected int numCl;
    protected String cliente;
    protected String numCue;
    protected double prestamo;
    protected double interes;
    protected int plazo;
    protected double pagar;

    public int getNumCl() {
        return numCl;
    }

    public void setNumCl(int numCl) {
        this.numCl = numCl;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumCue() {
        return numCue;
    }

    public void setNumCue(String numCue) {
        this.numCue = numCue;
    }

    public double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getPagar() {
        return pagar;
    }

    public abstract void calcularPagar();
}
