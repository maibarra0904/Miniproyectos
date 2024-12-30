import java.util.HashMap;
import java.util.Map;

public class ProgramaMayorOcurrenciaArray {

    public static void main(String[] args) {
        // Definimos un arreglo de 10 elementos
        int[] elementos = {1, 2, 3, 3, 2, 5, 5, 5, 6, 7};

        // Usamos un HashMap para contar las ocurrencias
        Map<Integer, Integer> contador = new HashMap<>();

        // Contar ocurrencias
        for (int num : elementos) {
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }

        // Encontrar el número con más ocurrencias
        int maxOcurrencias = 0;
        int elementoMasRepetido = -1;

        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > maxOcurrencias) {
                maxOcurrencias = entry.getValue();
                elementoMasRepetido = entry.getKey();
            }
        }

        // Imprimir resultados
        System.out.println("La mayor ocurrencia es: " + maxOcurrencias);
        System.out.println("El elemento que más se repite es: " + elementoMasRepetido);
    }
}
