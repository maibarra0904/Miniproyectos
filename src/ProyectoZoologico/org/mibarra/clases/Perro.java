package ProyectoZoologico.org.mibarra.clases;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El Perro salvaje africano caza en manadas en las llanuras de " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El Perro salvaje africano duerme en madrigueras en " + getHabitat();
    }

    @Override
    public String correr() {
        return "El Perro salvaje africano corre a gran velocidad para atrapar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El Perro salvaje africano ladra y emite sonidos agudos para comunicarse con su manada.";
    }
}

