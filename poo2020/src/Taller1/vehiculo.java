package Taller1;

public class vehiculo {
    private String modelo;
    private String color;
    private String tamaño;
    private String marca;
    private String motor;
    private String tipo;
    private String capacidad;
    public void transportar(){

    }
    public String obtener_nombre(){
        return modelo;
    }
    public String obtener_ubicacion(){
        return color;
    }
    public String obtener_infraestructura(){
        return tamaño;
    }
    public String obtener_carreras(){
        return marca;
    }
    public String obtener_area(){
        return motor;
    }
    public String obtener_tipo(){
        return tipo;
    }


    //ACTUALIZAR

    public void actualizar_nombre(String modelo){
        this.modelo= modelo;
    }
    public void actualizar_ubicacion(String color){
        this.color= color;
    }
    public void actualizar_infraestructura(String tamaño){
        this.tamaño= tamaño;
    }
    public void actualizar_carreras(String marca){
        this.marca= marca;
    }
    public void actualizar_area(String motor){
        this.motor= motor;
    }
    public void actualizar_tipo(String tipo){
        this.tipo= tipo;
    }
}
