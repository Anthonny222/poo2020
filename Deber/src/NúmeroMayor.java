public class NúmeroMayor {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int numMayor;

    /**
     * Metodo Constructor
     * @param num1, num2, num3, num4
     */
    public NúmeroMayor(int num1, int num2, int num3, int num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
    /**
     * Metodo para actualizar la variable num1,num2,num3 y num4
     * @param num1
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }
    /**
     * Metodo calcular el numero mayor
     */
    public void calcularMayor(){
        if(num1 > num2 && num1 > num3 && num1 > num4){
            numMayor = num1;
        }else{
            if(num2 > num3 && num2 > num4){
                numMayor = num2;
            }else{
                if(num3 > num4){
                    numMayor = num3;
                }else{
                    numMayor = num4;
                }
            }
        }
    }

    /**
     * Metodo para obtener el valor de la variable numMayor
     * @return numMayor
     */
    public int getNumMayor() {
        return numMayor;
    }
}
