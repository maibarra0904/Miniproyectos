import java.util.Scanner;

public class ProgramaEstanqueGasolina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la capacidad actual del estanque
        System.out.print("Ingrese la medida actual del estanque en litros: ");
        double medidaActual = scanner.nextDouble();

        // Definir los límites y los mensajes
        double[] limites = {0, 1, 20, 35, 40, 60, 70, Double.MAX_VALUE};
        String[] mensajes = {
            "Medida no válida",
            "Insuficiente",
            "Suficiente",
            "Medio Estanque",
            "Estanque 3/4",
            "Estanque casi lleno",
            "Estanque lleno",
            "Medida no válida"
        };

        String estadoEstanque = "Medida no válida";
        if (medidaActual > 70) {
            estadoEstanque = "Error: medida superior a la capacidad máxima de 70 litros";
        } else {
            for (int i = 0; i < limites.length - 1; i++) {
                if (medidaActual >= limites[i] && medidaActual < limites[i + 1]) {
                    estadoEstanque = mensajes[i];
                    break;
                }
            }
        }

        // Mostrar el estado del estanque
        System.out.println(estadoEstanque);

        // Cerrar el scanner
        scanner.close();
    }
}
