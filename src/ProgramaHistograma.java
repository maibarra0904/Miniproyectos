import java.util.Scanner;

public class ProgramaHistograma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elementos = new int[12];

        // Solicitar al usuario que ingrese los 12 números
        System.out.println("Introduce 12 números del 1 al 6:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            elementos[i] = scanner.nextInt();

            // Validar que el número esté en el rango de 1 a 6
            while (elementos[i] < 1 || elementos[i] > 6) {
                System.out.print("Número inválido. Introduce un número del 1 al 6: ");
                elementos[i] = scanner.nextInt();
            }
        }

        // Arreglo para contar las ocurrencias de cada número del 1 al 6
        int[] contador = new int[7]; // Usamos índice 0 a 6, donde 0 se ignorará

        // Contar ocurrencias
        for (int num : elementos) {
            contador[num]++;
        }

        // Imprimir el histograma
        System.out.println("Histograma de frecuencias:");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < contador[i]; j++) {
                System.out.print("*"); // Representación gráfica con asteriscos
            }
            System.out.println();
        }

        scanner.close();
    }
}
