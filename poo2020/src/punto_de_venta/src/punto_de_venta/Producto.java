package punto_de_venta;

public class Producto {

    private String nombre;
    private String unidad_medida;
    private int cantidad;
    private double precio;

    public Producto(String nombre, String unidad_medida, int cantidad, double precio) {
        this.nombre = nombre;
        this.unidad_medida = unidad_medida;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
