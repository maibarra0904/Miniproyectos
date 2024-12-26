import javax.swing.JOptionPane;

public class ProgramaNombreMasLargo {

    public static void main(String[] args) {
        // Pedir los nombres completos de tres personas
        String nombreCompleto1 = JOptionPane.showInputDialog("Ingrese el nombre completo de la primera persona:");
        String nombreCompleto2 = JOptionPane.showInputDialog("Ingrese el nombre completo de la segunda persona:");
        String nombreCompleto3 = JOptionPane.showInputDialog("Ingrese el nombre completo de la tercera persona:");

        // Calcular el nombre más largo basado en la longitud del nombre completo
        String nombreMasLargo = (nombreCompleto1.length() >= nombreCompleto2.length()) ?
                (nombreCompleto1.length() >= nombreCompleto3.length() ? nombreCompleto1 : nombreCompleto3) :
                (nombreCompleto2.length() >= nombreCompleto3.length() ? nombreCompleto2 : nombreCompleto3);

        // Imprimir el nombre más largo
        JOptionPane.showMessageDialog(null, "El nombre más largo es: " + nombreMasLargo);
    }
}


