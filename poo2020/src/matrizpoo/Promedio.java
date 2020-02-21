package matrizpoo;

/**
 * RamiroQuezada, Daniel Medina, Ian Ortega, Anthonny Espinosa
 */

public class Promedio {
    private int[][] matrizA = new int[50][50];
    private int promedio;
    private int suma;
    private int lim;

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int getPromedio() {
        for (int i = 0; i < getLim(); i++) {
            for (int j = 0; j < getLim(); j++) {
                promedio=suma/ getLim() ^2;

            }
        }
        return promedio;
    }

    public void calcularPromedio() {

        this.promedio=promedio;
    }

    public int getSuma() {
        for (int i = 0; i < getLim(); i++) {
            for (int j = 0; j < getLim(); j++) {
                suma=suma+matrizA[i][j];
            }
        }
        return suma;
    }

    public void calcularSuma() {

        this.suma=suma;

    }

    public int getLim() {
        return lim;
    }

    public void setLim(int lim) {
        this.lim = lim;
    }
}

