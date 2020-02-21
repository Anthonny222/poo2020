public class Cedula {
    private String id;
    private char[] arrayId;
    private String presentarSalida;
    private int calcularValidez;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char[] getArrayId() {
        return arrayId;
    }

    public void setArrayId() {
        arrayId = id.toCharArray();
    }

    public String getPresentarSalida() {
        return presentarSalida;
    }

    public void validarPresentarSalida() {
        if (arrayId[(arrayId.length - 1)] != 10) {
            presentarSalida = "Cédula Incorrecta.";
        } else {
            presentarSalida = ("Número de cédula: " + id + "\nDígito verificador: " + id + "\nEl número de cédula es" +
                    " correcto.");
        }
    }
    public void calcularValidez() {
    }
}
