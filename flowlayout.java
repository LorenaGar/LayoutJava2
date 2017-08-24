package Practica1;
import java.awt.*;
import javax.swing.*;
 
public class flowlayout {
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("Informacion personal");
        
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Enviar");
        // FlowLayout is default for JPanel
        JPanel panel = new JPanel(new FlowLayout());
        // add buttons to the panel
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100,100);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
