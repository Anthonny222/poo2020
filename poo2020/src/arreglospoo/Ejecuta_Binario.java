import java.util.Scanner;

public class Ejecuta_Binario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int bin;
        int aux;
        int residuo;
        boolean binValido;
        Binario convert = new Binario();
        do {
            System.out.print("Número binario a transformar: ");
            bin = teclado.nextInt();
            binValido = true;
            aux = bin;
            while (aux != 0) {
                residuo = aux % 10;
                if (residuo != 0 && residuo != 1) {
                    binValido = false;
                }
                aux /= 10;
            }
        } while (!binValido);

        convert.setBinario(Long.toString(bin)); // Parsing de long a String
        convert.setArrayBin();
        convert.calcularDecimal();
        System.out.println(convert.getBinario() + " en binario = " + convert.getDecimal() + " en decimal.");
    }
}
