import java.util.Scanner;

public class ProgramaMatricesH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            scanner.close();
            return;
        }

        int[][] matriz = new int[n][n];

        // Rellenar la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || j == 0 || (i > n / 2 && j == n - 1)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
