package productos;

public class Productos {

    private double costo;
    private String nombre;
    private double id;
    private int stock;

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addStock(int stock) {
        this.stock = this.stock + stock;
    }

    public void removeStock(int stock) {
        this.stock = this.stock - stock;
    }
}
