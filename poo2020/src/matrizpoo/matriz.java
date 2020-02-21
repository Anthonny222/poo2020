package matrizpoo;

public class matriz {
    private int[][] matrizA = new int[3][3];
    private int[][] matrizB = new int[3][3];
    private int[][] matrizC = new int[3][3];

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(int[][] matrizC) {
        this.matrizC = matrizC;
    }
    public void sumamatrices(){
        for (int i = 0; i <matrizA.length ; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizC[i][j] = matrizB[i][j] + matrizA[i][j];
            }
        }
    }
    public int [][] presentarMatriz(int[][]matriz){
        String cadena = "";
        for (int i = 0; i<matrizC.length; i++) {
            for (int j = 0; j <matrizC.length; j++) {
                matriz [i][j] = matrizC[i][j];
            }
        }
        return matriz;
    }
}
