import java.util.Scanner;

public class ProgramaMultiplicarSinMultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los dos números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Determinar el signo del resultado
        boolean esNegativo = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);

        // Convertir los números a valores absolutos para la multiplicación
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        // Multiplicación mediante sumas sucesivas
        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        // Aplicar el signo al resultado final
        if (esNegativo) {
            resultado = -resultado;
        }

        // Mostrar el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }
}

