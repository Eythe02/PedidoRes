
public class Articulo {

    private String nombre;
    private int cantidad;
    private double precio;

    public Articulo(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double getSubtotal() {
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return nombre + " (" + cantidad + " uds) - " + getSubtotal() + " €";
    }
}

