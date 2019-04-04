package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Juego extends JFrame{
	private File archivo;
	private String direccion;
	private Botones botones;
	private PanelDer pnlDerecho;
	
	public Juego(String direccion) throws IOException {
		// TODO Auto-generated constructor stub
		this.direccion=direccion;
		this.archivo=new File(direccion);
		super.setSize(1000, 800);
		super.setLayout(new BorderLayout());
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnlDerecho = new PanelDer();
		pnlDerecho.setPreferredSize(new Dimension(300, 800));
		super.add(pnlDerecho, BorderLayout.EAST);
		botones = new Botones(10, 10, archivo);
		botones.setPreferredSize(new Dimension(700, 800));
		super.add(botones, BorderLayout.WEST);
		super.repaint();
		super.setVisible(true);
	}

/*	public void iniciarComponentes(String str) throws IOException {
		this.archivo = new File(str);
		botones = new Botones(10, 10, archivo); 
		pnlDerecho = new PanelDer();

	}
	
	public void iniciar(String str) throws IOException {
		super.remove(botones);
		super.remove(pnlDerecho);
		iniciarComponentes(str);
		super.add(botones,pnlDerecho);
	}*/
	
	
}

