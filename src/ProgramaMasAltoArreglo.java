import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramaMasAltoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        
        // Leer 7 números enteros desde el teclado
        System.out.println("Ingresa 7 números enteros en el rango de 11 a 99:");
        for (int i = 0; i < 7; i++) {
            array[i] = scanner.nextInt();
        }

        // Usar un HashSet para eliminar duplicados
        Set<Integer> conjunto = new HashSet<>();
        for (int num : array) {
            conjunto.add(num);
        }

        // Encontrar el número más alto en el conjunto
        int maximo = Integer.MIN_VALUE;
        for (int num : conjunto) {
            if (num > maximo) {
                maximo = num;
            }
        }

        System.out.println("El número más alto del arreglo es: " + maximo);

        scanner.close();
    }
}
