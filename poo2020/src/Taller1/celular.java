package Taller1;

public class celular {
    private int tamaño;
    private String modelo;
    private String color;
    private String sitema_operativo;
    private String capacidad;

    public String obtener_computadora(){
        String celular = tamaño+"\n"+modelo+"\n"+color+"\n"+sitema_operativo+"\n"+capacidad;
        return celular;
    }
    public int obtener_tamaño(){
        return tamaño;
    }
    public String obtener_ubicacion(){
        return modelo;
    }
    public String obtener_infraestructura(){
        return color;
    }
    public String obtener_carreras(){
        return sitema_operativo;
    }
    public String obtener_area(){
        return capacidad;
    }


    //ACTUALIZAR

    public void actualizar_tamaño(int tamaño){
        this.tamaño= tamaño;
    }
    public void actualizar_modelo(String modelo){
        this.modelo= modelo;
    }
    public void actualizar_color(String color){
        this.color= color;
    }
    public void actualizar_carreras(String sitema_operativo){
        this.sitema_operativo= sitema_operativo;
    }
    public void actualizar_area(String capacidad){
        this.capacidad= capacidad;
    }

}
