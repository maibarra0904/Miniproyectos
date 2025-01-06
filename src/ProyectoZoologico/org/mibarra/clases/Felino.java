package ProyectoZoologico.org.mibarra.clases;

public abstract class Felino extends Mamifero {
    private double tamanoGarras;
    private int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public double getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}

