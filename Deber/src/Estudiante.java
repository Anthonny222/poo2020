public class Estudiante {
    private double calf1;
    private double calf2;
    private double calf3;
    private double calf4;
    private String nombre;
    private double prome;
    private String com;

    public void calcularPromedio(){
        prome = (calf1 + calf2 + calf3 + calf4) / 4;
    }

    public void calcularComentario(){
        if (prome >= 60){
            com ="Aprobado";
        }else{
            com = "Reprobado";
        }
    }
    /**
     * Metodoss para obtener el valor de la variable calf1 , 2, 3 y 4
     * @return calif1
     */
    public double getCalf1() {
        return calf1;
    }
    /**
     * Metodo para actualizar la variable calf1, 2, 3 y 4
     * @param calf1
     */
    public void setCalf1(double calf1) {
        this.calf1 = calf1;
    }

    public double getCalf2() {
        return calf2;
    }

    public void setCalf2(double calf2) {
        this.calf2 = calf2;
    }

    public double getCalf3() {
        return calf3;
    }

    public void setCalf3(double calf3) {
        this.calf3 = calf3;
    }

    public double getCalf4() {
        return calf4;
    }

    public void setCalf4(double calf4) {
        this.calf4 = calf4;
    }
    /**
     * Metodo para obtener el valor de la variable nombre, come y prom
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para actualizar la variable nombre, come y prom
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getProme() {
        return prome;
    }

    public void setProme(double prome) {
        this.prome = prome;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
}
