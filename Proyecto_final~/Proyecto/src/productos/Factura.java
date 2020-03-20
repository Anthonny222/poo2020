package productos;

public class Factura {

    private int cantidad;
    private double subtotal;
    private double total;
    private double iva;
    private double precio_unidad;

    public int getCantidad() {
        return cantidad;
    }

    public void precioUnidad(double a) {
        this.precio_unidad = a;

    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal() {
        this.subtotal = this.cantidad * this.precio_unidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.subtotal + this.iva;
    }

    public double getIva() {
        return iva;
    }

    public void setIva() {
        this.iva = this.subtotal * 0.12;
    }
}
