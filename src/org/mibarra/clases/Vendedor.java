package org.mibarra.clases;

public class Vendedor {
    private String nombre;
    private int id;

    public Vendedor(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}

