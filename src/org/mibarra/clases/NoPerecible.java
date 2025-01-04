package org.mibarra.clases;

public class NoPerecible extends Producto {
    private double peso;
    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio, double peso, int contenido, int calorias) {
        super(nombre, precio);
        this.peso = peso;
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public double getPeso() { 
        return peso; 
    } 

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return super.toString() + ", Contenido: " + contenido + " g, Calorias: " + calorias + " kcal" + peso + "kg";
    }
}

