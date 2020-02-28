package disenio_repeticion;

public class Empleado {
    private int horasTrabajadas;
    private int valorHora;
    private String nombre;
    private double sueldo;

    public double obtenerSUeldo(){
        return sueldo;
    }
    public String obtnerNombre(){
        return nombre;
    }
    public void calcularSueldo(){
        if (horasTrabajadas<=40) {
            sueldo = horasTrabajadas * valorHora;
        }else{
            sueldo= (40* valorHora)+(horasTrabajadas-40)*(valorHora*2);
        }
    }
    public Empleado(String nom, int horas, int valor){
       nombre= nom;
       horasTrabajadas=horas;
       valorHora=valor;
    }
    public Empleado(String nom,int horas){
        nombre=nom;
        horasTrabajadas=horas;
    }

    public void establecerValorHora(int valor) {
        valorHora = valor;
    }
}
