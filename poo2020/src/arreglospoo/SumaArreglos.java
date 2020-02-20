package arreglospoo;
/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */
public class SumaArreglos {
    private int[] vector1;
    private int[] vector2;
    int [] vector3 = new int[10];

    public int[] getVector1() {
        return vector1;
    }

    public void setVector1(int[] vector1) {
        this.vector1 = vector1;
    }

    public int[] getVector2() {
        return vector2;
    }

    public void setVector2(int[] vector2) {
        this.vector2 = vector2;
    }

    public int[] getVector3() {
        return vector3;
    }

    public void setVector3(int[] vector3) {
        this.vector3 = vector3;
    }

    public void calcularVector3(int[]vector1,int[]vector2){
        for (int i = 0; i <10 ; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
    }

    public SumaArreglos(int []vector1,int []vector2){
        this.vector1 = vector1;
        this.vector2 = vector2;
    }
}
