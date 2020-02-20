package arreglospoo;

public class Array {
    private int[] vectorA;
    private int[] vectorB;
    private int sumatoria_producto;

    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getSumatoria_producto() {
        return sumatoria_producto;
    }

    public void setSumatoria_producto(int sumatoria_producto) {
        this.sumatoria_producto = sumatoria_producto;
    }

    public void calcularSumatoriaProductos(){
        for (int i = 0; i <10 ; i++) {
            sumatoria_producto += (vectorA[i]*vectorB[i]);
        }
    }

    public Array(int []vectorA,int []vectorB){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }
}
