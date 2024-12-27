import javax.swing.JOptionPane;

public class ProgramaAdministrarProductos {

    public static void main(String[] args) {
        int opcion = -1;

        do {
            // Mostrar el menú
            String menu = "Seleccione una opción:\n"
                        + "1. Crear\n"
                        + "2. Actualizar\n"
                        + "3. Eliminar\n"
                        + "4. Listar\n"
                        + "5. Salir";

            String input = JOptionPane.showInputDialog(null, menu, "Menú", JOptionPane.QUESTION_MESSAGE);

            // Validar la entrada
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Haz salido con éxito!");
                System.out.println("Haz salido con éxito!");
                break;
            }

            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción no válida");
                System.out.println("Opción no válida");
                continue;
            }

            // Implementar las opciones del menú
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Producto creado correctamente");
                    System.out.println("Producto creado correctamente");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
                    System.out.println("Producto actualizado correctamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                    System.out.println("Producto eliminado correctamente");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Listado de productos:");
                    System.out.println("Listado de productos:");
                    // Aquí puedes añadir la lógica para listar los productos
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Haz salido con éxito!");
                    System.out.println("Haz salido con éxito!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
    }
}
