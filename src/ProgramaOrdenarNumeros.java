import java.util.Scanner;

public class ProgramaOrdenarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los números al usuario
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Utilizar el operador ternario para ordenar los números de mayor a menor
        int mayor = (numero1 > numero2) ? numero1 : numero2;
        int menor = (numero1 < numero2) ? numero1 : numero2;

        scanner.close();

        // Mostrar los números ordenados
        System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + menor);
    }
}

