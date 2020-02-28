public class Empleado {
    private double cuota;
    private int horas;
    private String nombre;
    private double sueldo;

    /**
     * Metodo que sirve para calcular el sueldo
     */
    public void calcularSueldo(){
        if(horas <= 40){
            sueldo = horas*cuota;
        }else{
            if(horas <= 50){
                sueldo = (40*cuota) + (horas-40)*cuota*2;
            }else{
                sueldo = (40*cuota) + (10*cuota) + (horas-50)*cuota*2;
            }
        }
    }
    /**
     * Metodo Constructor
     * @param nombre, cuota, horas
     */
    public Empleado(String nombre, double cuota, int horas ){
        this.nombre = nombre;
        this.cuota = cuota;
        this.horas = horas;
    }
    /**
     * Metodos para actualizar la variable nombre , cuota y horas
     * @param nombre
     */
    public void setNombre(String nombre){
        //con el this hacemos refeerencia a variables globales
        this.nombre = nombre;
    }

    public void setCuota(double cuota){
        //con el this hacemos refeerencia a variables globales
        this.cuota = cuota;
    }

    public void setHoras(int horas){
        //con el this hacemos refeerencia a variables globales
        this.horas = horas;
    }
    /**
     * Metodos para obtener el valor de la variable nombre y sueldo
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
}
