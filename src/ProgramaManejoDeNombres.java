import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaManejoDeNombres extends JFrame {
    
    private JTextField nombre1Field;
    private JTextField nombre2Field;
    private JTextField nombre3Field;
    private JLabel resultadoLabel;

    public ProgramaManejoDeNombres() {
        setTitle("Programa de Manejo de Nombres");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Crear componentes
        JLabel nombre1Label = new JLabel("Nombre 1:");
        nombre1Field = new JTextField();
        JLabel nombre2Label = new JLabel("Nombre 2:");
        nombre2Field = new JTextField();
        JLabel nombre3Label = new JLabel("Nombre 3:");
        nombre3Field = new JTextField();
        JButton procesarButton = new JButton("Procesar");
        resultadoLabel = new JLabel("Resultado: ");

        // Añadir componentes al JFrame
        add(nombre1Label);
        add(nombre1Field);
        add(nombre2Label);
        add(nombre2Field);
        add(nombre3Label);
        add(nombre3Field);
        add(procesarButton);
        add(resultadoLabel);

        // Agregar evento al botón
        procesarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarNombres();
            }
        });

        setVisible(true);
    }

    private void procesarNombres() {
        String[] nombres = {nombre1Field.getText(), nombre2Field.getText(), nombre3Field.getText()};
        String resultadoFinal = "";

        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            String nuevoNombre = nombre.charAt(1) + "." + nombre.substring(nombre.length() - 2);
            nuevoNombre = nuevoNombre.toUpperCase().charAt(0) + nuevoNombre.substring(1);
            if (i != 0) {
                resultadoFinal += "_";
            }
            resultadoFinal += nuevoNombre;
        }

        resultadoLabel.setText("Resultado: " + resultadoFinal);
    }

    public static void main(String[] args) {
        new ProgramaManejoDeNombres();
    }
}
