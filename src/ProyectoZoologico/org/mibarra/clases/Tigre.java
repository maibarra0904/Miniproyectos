package ProyectoZoologico.org.mibarra.clases;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " caza en solitario en las selvas de " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El Tigre " + especieTigre + " duerme en su cueva.";
    }

    @Override
    public String correr() {
        return "El Tigre puede correr a una velocidad de " + getVelocidad() + " km/h.";
    }

    @Override
    public String comunicarse() {
        return "El Tigre ruge ferozmente en la selva.";
    }
}

