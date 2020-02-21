package matrizpoo;

public class MatrizAvanzada {
    private int f; // filas
    private int c; // columnas
    private int[][] matrizOriginal = new int[f][c];



    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int[][] getMatrizOriginal() {
        return matrizOriginal;
    }

    public void setMatrizOriginal(int[][] matrizOriginal) {
        this.matrizOriginal = matrizOriginal;
    }


    public int[][] calcularMatrizTranspuesta(int[][]matrizOriginal){
        int[][] matrizTranspuesta = new int[c][f];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matrizTranspuesta[j][i]= matrizOriginal[i][j];
            }
        }
        return matrizTranspuesta;
    }
}
