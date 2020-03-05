package polimorfismoautomotriz;

public class EmpAdmvo extends Empleado {
    private double suel;

    public EmpAdmvo(String rfc, String nom, String dep, String puest, double suel){
        this.rfc = rfc;
        this.nom = nom;
        this.dep = dep;
        this.puest = puest;
        this.suel = suel;
    }

    public double getSuel() {
        return suel;
    }

    @Override
    public void calcularQuin(){
        quin = suel / 2;
    }
}
