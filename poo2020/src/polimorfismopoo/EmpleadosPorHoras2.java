package polimorfismopoo;

public class EmpleadosPorHoras2 extends Empleado12 {
    private double horas_trabajadas;
    private double cuotas_po_hora;

    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public void setCuotas_po_hora(double cuotas_po_hora) {
        this.cuotas_po_hora = cuotas_po_hora;
    }
    @Override
    public void calcularSueldoQna(){
      sueldo = horas_trabajadas*cuotas_po_hora;
    }
}
