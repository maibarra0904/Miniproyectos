package ProyectoZoologico.org.mibarra.clases;

public class Leon extends Felino {
    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas.";
    }

    @Override
    public String dormir() {
        return "El León duerme en las sombras de su habitat: " + getHabitat();
    }

    @Override
    public String correr() {
        return "El León corre a una velocidad de " + getVelocidad() + " km/h.";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugidoDecibel + " decibeles.";
    }
}

