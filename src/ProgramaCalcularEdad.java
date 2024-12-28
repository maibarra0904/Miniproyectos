import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ProgramaCalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu fecha de nacimiento (dd/MM/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();

        try {
            // Convertir la cadena a Date
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaNacimiento = formatoFecha.parse(fechaNacimientoStr);

            // Calcular la edad
            Calendar fechaNac = Calendar.getInstance();
            fechaNac.setTime(fechaNacimiento);
            
            Calendar fechaActual = Calendar.getInstance();
            int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

            // Ajustar la edad si aún no ha llegado el cumpleaños este año
            if (fechaActual.get(Calendar.MONTH) < fechaNac.get(Calendar.MONTH) || 
                (fechaActual.get(Calendar.MONTH) == fechaNac.get(Calendar.MONTH) && 
                 fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNac.get(Calendar.DAY_OF_MONTH))) {
                edad--;
            }
            System.out.println("Tu fecha de nacimiento convertida a tipo java.util.Date: " + fechaNacimiento);
            System.out.println("Tu edad es: " + edad + " años.");
        } catch (Exception e) {
            System.out.println("Formato de fecha inválido. Asegúrate de usar dd/MM/yyyy.");
        } finally {
            scanner.close();
        }
    }
}
