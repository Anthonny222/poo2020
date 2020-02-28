package herenciafigura;

public class Rectangulo extends Figura {
    protected double baseRecta;
    protected double altRecta;
    protected double areaRecta;

    public double getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public double getAltRecta() {
        return altRecta;
    }

    public void setAltRecta(double altRecta) {
        this.altRecta = altRecta;
    }

    public void calcularAreaRecta() {
        areaRecta=baseRecta*altRecta;

    }

    public double getAreaRecta() {
        return areaRecta;
    }
}
