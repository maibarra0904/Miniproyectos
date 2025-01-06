package ProyectoZoologico.org.mibarra.clases;

public class Guepardo extends Felino {
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza su presa a una velocidad impresionante.";
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme en las praderas de " + getHabitat();
    }

    @Override
    public String correr() {
        return "El Guepardo corre a una velocidad de " + getVelocidad() + " km/h.";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo emite un gruñido suave.";
    }
}

