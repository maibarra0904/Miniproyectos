package org.mibarra.clases;

public class Perecedero extends Producto {
    private String fechaExpiracion;
    private double temperaturaRecomendada;

    public Perecedero(String nombre, double precio, String fechaExpiracion, double temperaturaRecomendada) {
        super(nombre, precio);
        this.fechaExpiracion = fechaExpiracion;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de Expiración: " + fechaExpiracion + ", Temperatura Recomendada: " + temperaturaRecomendada + "°C";
    }
}
