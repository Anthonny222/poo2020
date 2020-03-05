package polimorfismoautomotriz;

public abstract class Empleado {
    protected String rfc;
    protected String nom;
    protected String dep;
    protected String puest;
    protected double quin;

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getPuest() {
        return puest;
    }

    public void setPuest(String puest) {
        this.puest = puest;
    }

    public double getQuin() {
        return quin;
    }

    public abstract void calcularQuin();
}
