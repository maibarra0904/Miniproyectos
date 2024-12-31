import java.util.Scanner;

public class ProgramaConMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("ERROR");
            scanner.close();
            return; // Finaliza la ejecución si n es cero o negativo
        }
        
        // Crear y llenar la matriz
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - 1 - i) {
                    matriz[i][j] = 'X'; // Diagonales
                } else {
                    matriz[i][j] = '_'; // Relleno
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
        
        scanner.close(); // Cierra el escáner
    }
}
