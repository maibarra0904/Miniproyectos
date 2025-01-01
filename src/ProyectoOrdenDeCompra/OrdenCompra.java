package ProyectoOrdenDeCompra;

import java.util.Date;

public class OrdenCompra {
    private static int contador = 0; // Contador para el autoincremento
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProducto = 0; // Para controlar la posición en el arreglo

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++contador; // Incrementar y asignar identificador
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto(Producto producto) {
        if (indiceProducto < productos.length) {
            productos[indiceProducto++] = producto;
        } else {
            System.out.println("No se pueden agregar más productos a la orden.");
        }
    }

    public int getGranTotal() {
        int total = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }
}
