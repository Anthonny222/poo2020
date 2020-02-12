package intropoo;

public class Estudiante {
    private String nombre;
    private String materia;
    private Double notaB1;
    private Double notaB2;

    /**
     * Metodo para las caracteristicas del estudiante
     *
     * @param nombre
     * @param materia
     * @param notaB1
     * @param notaB2
     */
    public Estudiante(String nombre, String materia, Double notaB1, Double notaB2) {
        this.setNombre(nombre);
        this.setMateria(materia);
        this.setNotaB1(notaB1);
        this.setNotaB2(notaB2);
    }

    /**
     * Metodo para obtener el estudiante
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar un estudiante
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la materia
     *
     * @return
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Metodo para actualizar la materia
     *
     * @param materia
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * Metodo para obtener la nota del bimestre 1
     *
     * @return notaB1
     */
    public Double getNotaB1() {
        return notaB1;
    }

    /**
     * Metodo para actualizar la nota del bimestre 1
     *
     * @param notaB1
     */
    public void setNotaB1(Double notaB1) {
        this.notaB1 = notaB1;
    }

    /**
     * Metodo para obtener la nota del bimestre 2
     *
     * @return notaB2
     */
    public Double getNotaB2() {
        return notaB2;
    }

    /**
     * Metodo para actualizar la nota del bimestre 2
     *
     * @param notaB2
     */
    public void setNotaB2(Double notaB2) {
        this.notaB2 = notaB2;
    }

    /**
     * Metodo para obtener la calificacion final y si el estudiante esta en supletorios
     *
     * @param notaB1
     * @param notaB2
     * @return cadena
     */
    public String getNotaF(Double notaB1, Double notaB2) {
        Double notaF = notaB1 + notaB2;
        String cadena;
        if (notaF <= 28) {
            cadena = "\nCalificación final: " + notaF + " [SUPLETORIOS]";
        } else {
            cadena = "\nCalificación final: " + notaF;
        }
        return cadena;
    }

    /**
     * Metodo para obtener el reporte del estudiante
     *
     * @return estudiante
     */
    public String getEstudiante() {
        String estudiante = "Estudiante: " + nombre + "\nMateria: " + materia + "\nBimestre 1: " + notaB1 + "\nBimestre 2: " + notaB2;
        return estudiante;
    }
}
