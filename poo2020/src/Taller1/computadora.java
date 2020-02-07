package Taller1;

public class computadora {
    private String procesador;
    private String gpu;
    private String placa_madre;
    private String ram;
    private String monitor;
    private String perifericos;
    public String obtener_computadora(){
        String computadora = procesador+"\n"+gpu+"\n"+placa_madre+"\n"+ram+"\n"+monitor+"\n"+perifericos;
        return computadora;
    }

    public String obtener_procesador(){
        return procesador;
    }
    public String obtener_gpu(){
        return gpu;
    }
    public String obtener_placa(){
        return placa_madre;
    }
    public String obtener_ram(){
        return ram;
    }
    public String obtener_monitor(){
        return monitor;
    }
    public String obtener_perifericos(){
        return perifericos;
    }


    //ACTUALIZAR

    public void actualizar_procesador(String procesador){
        this.procesador= procesador;
    }
    public void actualizar_gou(String gpu){
        this.gpu= gpu;
    }
    public void actualizar_placa(String placa_madre){
        this.placa_madre= placa_madre;
    }
    public void actualizar_ram(String ram){
        this.ram= ram;
    }
    public void actualizar_monitor(String monitor){
        this.monitor= monitor;
    }
    public void actualizar_perifericos(String perifericos){
        this.perifericos= perifericos;
    }
}
