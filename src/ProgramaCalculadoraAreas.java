import java.util.Scanner;

public class ProgramaCalculadoraAreas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Calculadora de Áreas de Figuras Geométricas");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Rombo");
        System.out.println("4. Círculo");
        System.out.print("Elige una figura (1-4): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1: // Triángulo
                System.out.print("Introduce la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Introduce la altura del triángulo: ");
                double height = scanner.nextDouble();
                double triangleArea = (base * height) / 2;
                System.out.println("Área del triángulo: " + triangleArea);
                break;

            case 2: // Rectángulo
                System.out.print("Introduce la base del rectángulo: ");
                double rectBase = scanner.nextDouble();
                System.out.print("Introduce la altura del rectángulo: ");
                double rectHeight = scanner.nextDouble();
                double rectangleArea = rectBase * rectHeight;
                System.out.println("Área del rectángulo: " + rectangleArea);
                break;

            case 3: // Rombo
                System.out.print("Introduce la diagonal mayor del rombo: ");
                double majorDiagonal = scanner.nextDouble();
                System.out.print("Introduce la diagonal menor del rombo: ");
                double minorDiagonal = scanner.nextDouble();
                double rhombusArea = (majorDiagonal * minorDiagonal) / 2;
                System.out.println("Área del rombo: " + rhombusArea);
                break;

            case 4: // Círculo
                System.out.print("Introduce el radio del círculo: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * Math.pow(radius, 2);
                System.out.println("Área del círculo: " + circleArea);
                break;

            default:
                System.out.println("Opción no válida. Por favor elige un número entre 1 y 4.");
        }

        scanner.close();
    }
}