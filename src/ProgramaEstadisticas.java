import java.util.Scanner;

public class ProgramaEstadisticas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        int sumaPositivos = 0, sumaNegativos = 0;
        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;

        // Leer 7 números
        System.out.println("Introduce 7 números:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Clasificar los números
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Calcular promedios
        double promedioPositivos = (contadorPositivos > 0) ? (double) sumaPositivos / contadorPositivos : 0;
        double promedioNegativos = (contadorNegativos > 0) ? (double) sumaNegativos / contadorNegativos : 0;

        // Mostrar resultados
        System.out.println("Promedio de números positivos: " + promedioPositivos);
        System.out.println("Promedio de números negativos: " + promedioNegativos);
        System.out.println("Cantidad de ceros: " + contadorCeros);

        scanner.close();
    }
}
