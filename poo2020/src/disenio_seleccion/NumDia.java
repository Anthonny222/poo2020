package disenio_seleccion;

public class NumDia {
    private int numDia;
    private String nombreDia;

    public int getNumDia() {
        return numDia;
    }

    public void setNumDia(int numDia) {
        this.numDia = numDia;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public NumDia(int numDia){
        this.numDia = numDia;
    }

    public String calcularNombre(int numDia){
        switch (numDia){
            case 1:
                nombreDia = "DOMINGO";
                break;
            case 2:
                nombreDia = "LUNES";
                break;
            case 3:
                nombreDia = "MARTES";
                break;
            case 4:
                nombreDia = "MIERCOLES";
                break;
            case 5:
                nombreDia = "JUEVES";
                break;
            case 6:
                nombreDia = "VIERNES";
                break;
            case 7:
                nombreDia = "SABADO";
                break;
            default:
                nombreDia = "Opcion incorrecta";

        }
        return nombreDia;
    }
}
