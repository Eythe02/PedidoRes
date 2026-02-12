
public class Pedido {

    private static int contador = 1;

    private int id;
    private String cliente;
    private Articulo[] articulos;
    private int cantidadArticulos;
    private EstadoPedido estado;

    public Pedido(String cliente) {
        this.id = contador++;
        this.cliente = cliente;
        this.articulos = new Articulo[5];
        this.cantidadArticulos = 0;
        this.estado = EstadoPedido.EN_PREPARACION;
    }

    public boolean agregarArticulo(Articulo a) {
        if (cantidadArticulos == 5) {
            System.out.println("No se pueden añadir más artículos.");
            return false;
        }
        articulos[cantidadArticulos] = a;
        cantidadArticulos++;
        return true;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidadArticulos; i++) {
            total += articulos[i].getSubtotal();
        }
        return total;
    }

    public boolean cambiarEstado(EstadoPedido nuevo) {
        if (nuevo.ordinal() < estado.ordinal()) {
            System.out.println("No se puede retroceder el estado.");
            return false;
        }
        estado = nuevo;
        return true;
    }

    public void mostrar() {
        System.out.println("Pedido #" + id);
        System.out.println("Cliente: " + cliente);
        System.out.println("Estado: " + estado);
        System.out.println("Artículos:");

        for (int i = 0; i < cantidadArticulos; i++) {
            System.out.println(" - " + articulos[i]);
        }

        System.out.println("Total: " + calcularTotal() + " €");
        System.out.println("---------------------------");
    }
}

