package intropoo;

public class Tiempo {

    //definicion de atributos globales
    private int hora;
    private int minuto;
    private int segundo;


    /**
     * Metodo para obtener el valor de variable hora
     * @return this.hora
     */
    public int obtener_hora(){
        return this.hora;
    }
    /**
     * Metodo para obtener el valor de variable minuto
     * @return this.minuto
     */
    public int obtener_minuto() {
        return this.minuto;
    }
    /**
     * Metodo para obtener el valor de variable segundo
     * @return this.segundo
     */
    public int obtener_segundo(){
        return this.segundo;
    }

    public String obtener_tiempo(){
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }

    /**
     * Metodo para obtener la variable hora
     * @param hora
     */
    public void actualizar_hora(int hora){
        //con el this hacemos referencia a variables globales
        this.hora= hora;
    }
    /**
     * Metodo para obtener la variable minuto
     * @param minuto
     */
    public void actualizar_minuto(int minuto){
        this.minuto= minuto;
    }
    /**
     * Metodo para obtener la variable segundo
     * @param segundo
     */
    public void actualizar_segundo(int segundo){
        this.segundo=segundo;
    }

}