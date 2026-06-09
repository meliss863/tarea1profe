/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correccion;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author Riven & Meliss863
 */
public class CorreccionBugs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registro de Datos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        // Correccion: Mantén solo un setLayout, el GridLayout es mejor para formularios
        frame.setLayout(new java.awt.GridLayout(6, 2, 5, 5));

        // Correcion: Definimos el array final para que el ActionListener pueda usarlo
        final JTextField[] campos = new JTextField[5];
        String[] etiquetas = {"Nombre:", "Apellido:", "Email:", "Teléfono:", "Dirección:"};

        for (int i = 0; i < etiquetas.length; i++) {
            frame.add(new JLabel(etiquetas[i]));
            campos[i] = new JTextField();
            frame.add(campos[i]);
        }

        JTextArea resumen = new JTextArea(3, 30);
        resumen.setEditable(false);

        JButton btn = new JButton("Mostrar el resumen");
        btn.addActionListener(e -> {
            // Correcion: Ahora campos es accesible aquí
            resumen.setText(
                    "Nombre: " + campos[0].getText() + " " + campos[1].getText() + "\n"
                    + "Email: " + campos[2].getText() + "\n"
                    + "Tel: " + campos[3].getText() + " | Dirección: " + campos[4].getText()
            );
        });

        frame.add(btn);
        frame.add(new JScrollPane(resumen));
        frame.setVisible(true);
    }
}
