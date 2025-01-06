package ProyectoZoologico.org.mibarra.clases;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza en grupo con su camada de " + numCamada + " individuos.";
    }

    @Override
    public String dormir() {
        return "El Lobo " + getColor() + " duerme en las cavernas de " + getHabitat();
    }

    @Override
    public String correr() {
        return "El Lobo corre rápidamente por los bosques de " + getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El Lobo aúlla para comunicarse con su manada.";
    }
}

