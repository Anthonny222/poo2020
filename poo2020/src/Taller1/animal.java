package Taller1;

public class animal {
    private String especie;
    private String tamaño;
    private String peso;
    private String alimentacion;
    private String reproduccion;
    private String calsificacion;
    public void reprodicir(){

    }
    public void alimentar(){

    }
    public String obtener_especie(){
        return especie;
    }
    public String obtener_tamaño(){
        return tamaño;
    }
    public String obtener_peso(){
        return peso;
    }
    public String obtener_alimentacion(){
        return alimentacion;
    }
    public String obtener_reproduccion(){
        return reproduccion;
    }
    public String obtener_clasificacion(){
        return calsificacion;
    }


    //ACTUALIZAR

    public void actualizar_especie(String especie){
        this.especie= especie;
    }
    public void actualizar_tamaño(String tamaño){
        this.tamaño= tamaño;
    }
    public void actualizar_peso(String peso){
        this.peso= peso;
    }
    public void actualizar_alimentacion(String alimentacion){
        this.alimentacion= alimentacion;
    }
    public void actualizar_reproduccion(String reproduccion){
        this.reproduccion= reproduccion;
    }
    public void actualizar_clasificacion(String calsificacion){
        this.calsificacion= calsificacion;
    }
}
