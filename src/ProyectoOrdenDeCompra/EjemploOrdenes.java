package ProyectoOrdenDeCompra;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        // Crear productos
        Producto prod1 = new Producto("Fabricante A", "Producto A1", 100);
        Producto prod2 = new Producto("Fabricante A", "Producto A2", 150);
        Producto prod3 = new Producto("Fabricante B", "Producto B1", 200);
        Producto prod4 = new Producto("Fabricante B", "Producto B2", 250);
        Producto prod5 = new Producto("Fabricante C", "Producto C1", 300);
        Producto prod6 = new Producto("Fabricante C", "Producto C2", 350);
        Producto prod7 = new Producto("Fabricante D", "Producto D1", 400);
        Producto prod8 = new Producto("Fabricante D", "Producto D2", 450);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "Pérez");
        Cliente cliente2 = new Cliente("María", "Gómez");
        Cliente cliente3 = new Cliente("Luis", "Martínez");

        // Crear órdenes de compra
        OrdenCompra orden1 = new OrdenCompra("Orden 1");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(prod1);
        orden1.addProducto(prod2);
        orden1.addProducto(prod3);
        orden1.addProducto(prod4);

        OrdenCompra orden2 = new OrdenCompra("Orden 2");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(prod5);
        orden2.addProducto(prod6);
        orden2.addProducto(prod7);
        orden2.addProducto(prod8);

        OrdenCompra orden3 = new OrdenCompra("Orden 3");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(prod1);
        orden3.addProducto(prod5);
        orden3.addProducto(prod3);
        orden3.addProducto(prod7);

        // Imprimir detalles de las órdenes
        imprimirOrden(orden1);
        imprimirOrden(orden2);
        imprimirOrden(orden3);
    }

    private static void imprimirOrden(OrdenCompra orden) {
        System.out.println("ID Orden: " + orden.getIdentificador());
        System.out.println("Descripción: " + orden.getDescripcion());
        System.out.println("Cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Productos:");
        for (Producto producto : orden.getProductos()) {
            if (producto != null) {
                System.out.println(" - " + producto.getFabricante() + ", " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        }
        System.out.println("Gran Total: " + orden.getGranTotal());
        System.out.println();
    }
}
