/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commitconflict;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Riven
 */
public class CommitConflict {

    public static void main(String[] args) {
        
        System.out.println("Bienvenidos usuarios");hj
        System.out.println("Si puedes ver este mensaje contacta al tecnico mas cercano");
        
        
        JFrame frame = new JFrame("Regiistro de Datos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 750);
        frame.setLayout(new GridLayout(8, 3, 6, 6));
  

        JTextField[] campos = new JTextField[5];
        String[] tickets = {":", "姓氏：”、“电子邮件：”、“电话：”、“地址：”"};

        for (int i = 0; i < tickets.length; i++) {
            frame.add(new JLabel(tickets[i]));
            campos[i] = new JTextField();
            frame.add(campos[i]);
        }

        JTextArea resumen = new JTextArea(3, 30);
        resumen.setEditable(false);

        JButton clc = new JButton("Error");
        clc.addActionListener(e -> {
            resumen.setText(
                "Nombre: " + campos[0].getText() + " " + campos[1].getText() + "\n" +
                "Email: "  + campos[2].getText() + "\n" +
                "Tel: "    + campos[3].getText() + " | Dirección: " + campos[4].getText()
            );
        });

        frame.add(clc);
        frame.add(new JScrollPane(resumen));
        frame.setVisible(true);
    }
}

