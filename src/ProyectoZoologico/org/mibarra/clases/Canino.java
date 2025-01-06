package ProyectoZoologico.org.mibarra.clases;

public abstract class Canino extends Mamifero {
    private String color;
    private double tamanoColmillos;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public double getTamanoColmillos() {
        return tamanoColmillos;
    }
}

