package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;


public class PanelPalabras extends JPanel{
	private JLabel palabras [] = new JLabel[6];
	public PanelPalabras() {
		// TODO Auto-generated constructor stub
		super.setLayout(new GridLayout(6,1, 10, 0));
		palabras[0] = new JLabel("karim");
		palabras[1] = new JLabel("objeto");
		palabras[2] = new JLabel("programa");
		palabras[3] = new JLabel("password");
		palabras[4] = new JLabel("herencia");
		palabras[5] = new JLabel("array");
		Font fuente = new Font("Futura", 0, 20);
		for (int i = 0; i < palabras.length; i++) {
			palabras[i].setBackground(Color.WHITE);
			palabras[i].setFont(fuente);
			palabras[i].setBorder(new BevelBorder(BevelBorder.RAISED));
			palabras[i].setOpaque(true);
			super.add(palabras[i]);
		}
		super.setBackground(Color.WHITE);
		super.setVisible(true);
	}

	/*public void iguales(String palabra){
		if(palabra=="karim"){
			palabras[0].setBackground(Color.LIGHT_GRAY);
			palabras[0].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
			palabras[0].setOpaque(true);
		}
		else{
			System.out.println("Falta");
		}
	}*/

}
