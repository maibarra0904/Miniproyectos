public class ProgramaCalculaAreaLineaComandos {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, proporciona la figura (1-4) y los parámetros necesarios.");
            return;
        }

        int choice = Integer.parseInt(args[0]);

        switch (choice) {
            case 1: // Triángulo
                if (args.length < 3) {
                    System.out.println("Para el triángulo, proporciona la base y la altura.");
                    return;
                }
                double base = Double.parseDouble(args[1]);
                double height = Double.parseDouble(args[2]);
                double triangleArea = (base * height) / 2;
                System.out.println("Área del triángulo: " + triangleArea);
                break;

            case 2: // Rectángulo
                if (args.length < 3) {
                    System.out.println("Para el rectángulo, proporciona la base y la altura.");
                    return;
                }
                double rectBase = Double.parseDouble(args[1]);
                double rectHeight = Double.parseDouble(args[2]);
                double rectangleArea = rectBase * rectHeight;
                System.out.println("Área del rectángulo: " + rectangleArea);
                break;

            case 3: // Rombo
                if (args.length < 3) {
                    System.out.println("Para el rombo, proporciona las diagonales mayor y menor.");
                    return;
                }
                double majorDiagonal = Double.parseDouble(args[1]);
                double minorDiagonal = Double.parseDouble(args[2]);
                double rhombusArea = (majorDiagonal * minorDiagonal) / 2;
                System.out.println("Área del rombo: " + rhombusArea);
                break;

            case 4: // Círculo
                if (args.length < 2) {
                    System.out.println("Para el círculo, proporciona el radio.");
                    return;
                }
                double radius = Double.parseDouble(args[1]);
                double circleArea = Math.PI * Math.pow(radius, 2);
                System.out.println("Área del círculo: " + circleArea);
                break;

            default:
                System.out.println("Opción no válida. Por favor elige un número entre 1 y 4.");
        }
    }
}
