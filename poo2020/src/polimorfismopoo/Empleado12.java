package polimorfismopoo;

public abstract class Empleado12 {
    protected String Nombre;
    protected String departamente;
    protected String puesto;
    protected double sueldo;

    /**
     * metod abstracto , que sera implementado dentro de las clses hijas
     */
    public abstract void calcularSueldoQna();


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDepartamente() {
        return departamente;
    }

    public void setDepartamente(String departamente) {
        this.departamente = departamente;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }
}
