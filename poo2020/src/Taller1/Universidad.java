package Taller1;

public class Universidad {
    private String nombre;
    private String ubicaccion;
    private String infraestructura;
    private String carreras;
    private String area;
    private String tipo_univ;
    private String calificacion;
    public String obtener_universidad(){
        String estudiante = nombre+"\n"+ubicaccion+"\n"+infraestructura+"\n"+area+"\n"+carreras+"\n"+tipo_univ;
        return estudiante;
    }
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_ubicacion(){
        return ubicaccion;
    }
    public String obtener_infraestructura(){
        return infraestructura;
    }
    public String obtener_carreras(){
        return carreras;
    }
    public String obtener_area(){
        return area;
    }
    public String obtener_tipo(){
        return tipo_univ;
    }


    //ACTUALIZAR

    public void actualizar_nombre(String nombre){
        this.nombre= nombre;
    }
    public void actualizar_ubicacion(String ubicaccion){
        this.ubicaccion= ubicaccion;
    }
    public void actualizar_infraestructura(String infraestructura){
        this.infraestructura= infraestructura;
    }
    public void actualizar_carreras(String carreras){
        this.carreras= carreras;
    }
    public void actualizar_area(String area){
        this.area= area;
    }
    public void actualizar_tipo(String tipo_univ){
        this.tipo_univ= tipo_univ;
    }
}
