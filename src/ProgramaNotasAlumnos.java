import java.util.Scanner;

public class ProgramaNotasAlumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaNotasMayoresA5 = 0;
        double sumaNotasMenoresA4 = 0;
        int cantidadNotas1 = 0;
        double sumaTotalNotas = 0;
        int countNotasMayoresA5 = 0;
        int countNotasMenoresA4 = 0;
        int totalNotasIngresadas = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " (escala 1 a 7, o 0 para salir): ");
            double nota = scanner.nextDouble();

            if (nota == 0) {
                System.out.println("Error: nota ingresada no válida. Programa finalizado.");
                break;
            } else if (nota < 1 || nota > 7) {
                System.out.println("Nota fuera de rango. Por favor, ingrese una nota válida entre 1 y 7.");
                i--; // Decrementar i para pedir la nota nuevamente
                continue;
            }

            if (nota > 5) {
                sumaNotasMayoresA5 += nota;
                countNotasMayoresA5++;
            } else if (nota < 4) {
                sumaNotasMenoresA4 += nota;
                countNotasMenoresA4++;
            }

            if (nota == 1) {
                cantidadNotas1++;
            }

            sumaTotalNotas += nota;
            totalNotasIngresadas++;
        }

        // Calcular promedios
        double promedioNotasMayoresA5 = (countNotasMayoresA5 > 0) ? sumaNotasMayoresA5 / countNotasMayoresA5 : 0;
        double promedioNotasMenoresA4 = (countNotasMenoresA4 > 0) ? sumaNotasMenoresA4 / countNotasMenoresA4 : 0;
        double promedioTotalNotas = (totalNotasIngresadas > 0) ? sumaTotalNotas / totalNotasIngresadas : 0;

        // Mostrar resultados
        System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        System.out.println("Promedio de notas menores a 4: " + promedioNotasMenoresA4);
        System.out.println("Cantidad de notas 1: " + cantidadNotas1);
        System.out.println("Promedio total de notas: " + promedioTotalNotas);

        scanner.close();
    }
}

