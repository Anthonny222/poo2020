package arreglospoo;

/**
 * Anthonny Espinosa, Ian Ortega, Ramiro Quezada
 */
public class DesviacionMedia {
    private int[] numero=new int[15];
    private int media;
    private double[] desviacion=new double[15];

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public double[] getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(double[] desviacion) {
        this.desviacion = desviacion;
    }
    public void  calcular_media(){
        int i,  sumatoria;
        sumatoria=0;
        for ( i = 0; i <=14 ; i++) {
            sumatoria=sumatoria+numero[i];

        }
        media=sumatoria/i;

    }
    public void calcular_desviacion(){
        int j;
        for ( j = 0; j <=14 ; j++) {
            desviacion [j]=numero[j]-media;

        }

    }

}
