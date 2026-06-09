/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectointerno;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Riven-702 & Meliss863
 */
public class ProyectoInterno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Regiistro de Datos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new GridLayout(7, 2, 5, 5));


        JTextField[] campos = new JTextField[5];
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
            resumen.setText(
                "Nombre: " + campos[0].getText() + " " + campos[1].getText() + "\n" +
                "Email: "  + campos[2].getText() + "\n" +
                "Tel: "    + campos[3].getText() + " | Dirección: " + campos[4].getText()
            );
        });

        frame.add(btn);
        frame.add(new JScrollPane(resumen));
        frame.setVisible(true);
    }
}
    
    

