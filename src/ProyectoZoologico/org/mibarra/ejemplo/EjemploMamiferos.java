package ProyectoZoologico.org.mibarra.ejemplo;

import ProyectoZoologico.org.mibarra.clases.*;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        mamiferos[0] = new Leon("Sur Africa", 1.2, 2.5, 190.0, "Panthera leo", 5.0, 60, 15, 114);
        mamiferos[1] = new Tigre("Asia", 1.1, 2.9, 220.0, "Panthera tigris", 6.0, 65, "Tigre de Bengala");
        mamiferos[2] = new Guepardo("Africa", 0.8, 1.5, 72.0, "Acinonyx jubatus", 3.0, 120);
        mamiferos[3] = new Lobo("Bosques de Norteamérica", 0.9, 1.6, 50.0, "Canis lupus", "Gris", 4.5, 5, "Lobo Gris");
        mamiferos[4] = new Perro("Savanas de África", 0.75, 1.1, 30.0, "Lycaon pictus", "Moteado", 2.5, 320);
        mamiferos[5] = new Lobo("Bosques de Europa", 0.9, 1.7, 45.0, "Canis lupus", "Blanco", 4.3, 6, "Lobo Ártico");

        for (Mamifero animal : mamiferos) {
            System.out.println(animal.getNombreCientifico());
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura() + " m");
            System.out.println("Largo: " + animal.getLargo() + " m");
            System.out.println("Peso: " + animal.getPeso() + " kg");
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
            System.out.println();
        }
    }
}

