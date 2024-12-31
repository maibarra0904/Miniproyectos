import java.util.Scanner;

public class ProgramaOrdenArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Leer 10 números enteros desde el teclado
        System.out.println("Ingresa 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        // Mostrar los números en el orden especificado
        System.out.println("Números en el orden especial:");
        for (int i = 0; i < 5; i++) {
            // Imprimir el último, el primero, el penúltimo, el segundo, etc.
            System.out.print(array[9 - i] + " ");
            System.out.print(array[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
    
}

