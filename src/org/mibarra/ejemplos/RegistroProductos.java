package org.mibarra.ejemplos;

import org.mibarra.clases.*;

public class RegistroProductos {
    public static void main(String[] args) {
        Producto[] productos = new Producto[10];

        productos[0] = new Fruta("Manzana", 1.2, 0.5, "Rojo");
        productos[1] = new Fruta("Banana", 0.8, 0.3, "Amarillo");
        productos[2] = new Limpieza("Detergente", 2.5, "Componentes A, B, C", 1.5);
        productos[3] = new Limpieza("Jabón Líquido", 3.0, "Componentes X, Y, Z", 2.0);
        productos[4] = new Lacteo("Leche", 1.5, 6, 8);
        productos[5] = new Lacteo("Queso", 2.0, 10, 15);
        productos[6] = new NoPerecible("Arroz", 0.9, 1.2, 500, 350);
        productos[7] = new NoPerecible("Pasta", 1.0, 0.5, 400, 320);
        productos[8] = new Perecedero("Leche", 1.5, "2025-01-01", 4.0); 
        productos[9] = new Perecedero("Manzana", 0.5, "2024-12-31", 10.0);

        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }

        Vendedor vendedor1 = new Vendedor("Carlos", 1); 
        Vendedor vendedor2 = new Vendedor("Ana", 2); 
        Cliente cliente1 = new Cliente("Juan", "Calle Falsa 123"); 
        Cliente cliente2 = new Cliente("Maria", "Avenida Siempre Viva 456"); 
        System.out.println(vendedor1.toString()); 
        System.out.println(vendedor2.toString()); 
        System.out.println(cliente1.toString()); 
        System.out.println(cliente2.toString());
    }
}

