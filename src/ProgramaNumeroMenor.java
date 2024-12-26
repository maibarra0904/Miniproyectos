import java.util.Scanner;

public class ProgramaNumeroMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 0;

        // Pedir la cantidad de números a comparar hasta que sea mínimo 10
        while (cantidadNumeros < 10) {
            System.out.print("Ingrese la cantidad de números a comparar (mínimo 10): ");
            // Validar la entrada
            if (scanner.hasNextInt()) {
                cantidadNumeros = scanner.nextInt();
                if (cantidadNumeros < 10) {
                    System.out.println("Debe ingresar al menos 10 números.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar entrada no válida
            }
        }

        // Inicializar el menor número a un valor grande
        int menorNumero = Integer.MAX_VALUE;

        // Iterar para ingresar los números y encontrar el menor
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            // Validar la entrada
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar entrada no válida
            }
            int numero = scanner.nextInt();
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        // Imprimir el menor número
        System.out.println("El menor número es: " + menorNumero);

        // Verificar si el menor número es menor que 10
        if (menorNumero < 10) {
            System.out.println("¡El número menor es menor que 10!");
        } else {
            System.out.println("¡El número menor es igual o mayor que 10!");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
