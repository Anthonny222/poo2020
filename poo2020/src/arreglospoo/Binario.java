public class Binario {

    private String binario;
    private char[] arrayBin;
    private int decimal;

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

    public char[] getArrayBin() {
        return arrayBin;
    }

    public void setArrayBin() {
        arrayBin = binario.toCharArray();
    }

    public int getDecimal() {
        return decimal;
    }

    public void calcularDecimal() {
        int aux = 0;
        double suma = 0;
        for (int i = (binario.length() - 1); i >= 0; i--) {
            suma = suma + (Integer.parseInt(String.valueOf(arrayBin[i])) * Math.pow(2, aux));
            aux++;
        }
        decimal = (int) suma;
    }
}
