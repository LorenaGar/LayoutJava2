package Practica1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrimerInterfaz extends JFrame{
	private JLabel eti1, eti2, eti3,eti4;
	private JTextField Camp1, Camp2,Camp3,Camp4;
	
	public PrimerInterfaz () {
		
		super("Informacion personal");
		JFrame frame = new JFrame("Informacion personal");
		JPanel panel = new JPanel(new FlowLayout());
		
		JButton btn1 ;
		
		eti1=new  JLabel("Nombre:");
		panel.add(eti1);
		Camp1=new JTextField(15);
		panel.add(Camp1);
		
		eti2=new  JLabel("Apellidos:");
		panel.add(eti2);
		Camp2=new JTextField(15);
		panel.add(Camp2);
		
		eti3=new  JLabel("Domicilio:");
		panel.add(eti3);
		Camp3=new JTextField(15);
		panel.add(Camp3);
		
		eti4=new  JLabel("Telefono:");
		panel.add(eti4);
		Camp4=new JTextField(15);
		panel.add(Camp4);
		
		btn1= new JButton("enviar");
		panel.add(btn1);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
		
	}
	public static void main(String[] args) {
	 
        PrimerInterfaz aplicacion=new PrimerInterfaz();
    	aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }
}
