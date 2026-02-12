public class Main {
    public static void main(String[] args) {

        Pedido p = new Pedido("Lucía Gómez");

        p.agregarArticulo(new Articulo("Pizza", 1, 8.50));
        p.agregarArticulo(new Articulo("Agua", 2, 1.20));
        p.agregarArticulo(new Articulo("Helado", 1, 3.00));

        p.mostrar();

        p.cambiarEstado(EstadoPedido.LISTO);
        p.mostrar();

        p.cambiarEstado(EstadoPedido.ENTREGADO);
        p.mostrar();
    }
}

