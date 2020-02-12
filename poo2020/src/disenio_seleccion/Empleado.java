package disenio_seleccion;

public class Empleado {
    private String nombre;
    private int horas;
    private double cuotas;
    private double sueldo;
    private String presentar;

    public Empleado (String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.cuotas = cuotas;
        this.sueldo = calcular_sueldo(horas, cuotas);
        this.horas = horas;
    }
    public double calcular_sueldo(int horas,double coutas){
        if (horas<=40){
            sueldo=horas*coutas;
        }else {
            sueldo=(40*coutas)+((horas-40)*(coutas*2));
        }
        return sueldo;
    }
    public String  presentar(){
        String mensaje = String.format("nombre del empleado: %s\nsueldo del empelado: %s.2f",nombre,calcular_sueldo(horas, cuotas));
        return presentar;
    }
}
