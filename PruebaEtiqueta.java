package Practica1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEtiqueta extends JFrame {

	private JLabel etiqueta1, etiqueta2, etiqueta3;
	
	public PruebaEtiqueta() {
		
		super("Prueba de JLabel");
		Container contenedor =getContentPane();
		contenedor.setLayout(new FlowLayout());
		
		etiqueta1= new JLabel("Etiqueta con texto ");
		etiqueta1.setToolTipText("Esta es la etiqueta1");
		contenedor.add(etiqueta1);
		
		Icon insecto=new ImageIcon("Sponja.jpg");
		etiqueta2=new JLabel("Etiqueta con texto e icono ", 
		insecto,SwingConstants.LEFT);
		etiqueta2.setToolTipText("Esta es la etiqueta2");
		contenedor.add(etiqueta2);
		
		etiqueta3=new JLabel();	
		etiqueta3.setText("etiqueta con icono y texto en parte inferiror");
		etiqueta3.setIcon(insecto);
		etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
		etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
		etiqueta3.setToolTipText("Esta es la etiqueta3");
		contenedor.add(etiqueta3);
		
		setSize(275,170);
		setVisible(true);
		
	}//fin constructor
	public static void main(String[] args) {
	PruebaEtiqueta aplicacion=new PruebaEtiqueta();
	aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}//Fin de la clase PruebaEtiqueta
