package polimorfismoautomotriz;

public class Mecanico extends Empleado {
    private int num;
    private double costo;

    public Mecanico(String rfc, String nom, String dep, String puest, int num, double costo){
        this.rfc = rfc;
        this.nom = nom;
        this.dep = dep;
        this.puest = puest;
        this.num = num;
        this.costo = costo;
    }

    public int getNum() {
        return num;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public void calcularQuin() {
        quin = (num * costo) * 0.04;
    }
}
