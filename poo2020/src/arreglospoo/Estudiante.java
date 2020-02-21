public class Estudiante {
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];
    private String salida;

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }

    public String[] getCelular() {
        return celular;
    }

    public void setCelular(String[] celular) {
        this.celular = celular;
    }

    public String getSalida() {
        return salida;
    }

    public void presentar() {
        salida = "";
        for (int i = 0; i < nombre.length; i++) {
            salida = String.format("%s-\tNombre: %s\n-\tEdad: %d\n-\tUniversidad: %s\n-\tCelular: %s\n\n", salida,
                    nombre[i], edad[i], universidad[i], celular[i]);
        }
    }
}
