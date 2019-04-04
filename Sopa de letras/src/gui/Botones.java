package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import com.sun.java.swing.*;
import java.awt.*;

import objetos.Palabras;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Excepciones.*;

public class Botones extends JPanel{
	private File archivo;
	private ArrayList<JButton> botoncitos = new ArrayList<>();	
	private int i = 0;
	int a=0;
	private JPanel Rendir = new JPanel();
	private JPanel Botones = new JPanel();
	private ArrayList<Character> sopa = new ArrayList<>();

	public Botones(int filas, int columnas, File archivo) throws IOException {
		super.setLayout(new BorderLayout());
		Rendir.setLayout(new BorderLayout());
		Rendir.setPreferredSize(new Dimension(100,50));
		this.archivo=archivo;
		this.sopa=leerArchivo();
		JButton rendir = new JButton("Mostrar");
		Botones.setLayout(new GridLayout(filas, columnas, 5, 5));
		
		for ( i = 0; i < 100; i++) {
			JButton botoncito = new JButton(this.sopa.get(i).toString());
			Palabras palabra = new Palabras();
			if(i==0||i==1||i==2||i==3||i==4||i==90||i==91||i==92||i==93||i==94||i==95||i==96||i==97
			||i==81||i==72||i==63||i==54||i==45||i==36||i==27
			||i==51||i==52||i==53||i==54||i==55||i==72||i==73||i==74||i==75||i==76||i==77
			||i==8||i==18||i==28||i==38||i==48||i==58||i==68||i==78){
				palabra.setNum(1);
				botoncitos.add(botoncito);
			}
			else{
				palabra.setNum(0);
			}
			botoncito.addActionListener(new ActionListener(){
			
				@Override
				public void actionPerformed(ActionEvent e) {
					if(palabra.getComprobar()==null){
					try{
					palabra.add(palabra.getNum());
					palabra.setComprobar(1);
					a++;
					botoncito.setBackground(Color.GREEN);
				 	botoncito.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));	
					}catch (Nosirve ex){
						Error(ex);
					}
				}
					if(a==37){
						ganar();
					}
			}
			});
			Botones.add(botoncito);
		}
		rendir.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Revelar();
			}
		});
		Rendir.add(rendir, BorderLayout.CENTER);
		Rendir.setBackground(Color.BLACK);
		super.add(Botones);
		super.add(Rendir, BorderLayout.SOUTH);
		super.repaint();
		super.setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Character> leerArchivo() throws IOException{
		ArrayList<Character> string = new ArrayList<>();
		FileReader leerArchivo = new FileReader(archivo);
		int c = leerArchivo.read();
		while(c!=-1) {
			if(c!=13 && c!=10) {
				string.add((char) c);
			}
			c = leerArchivo.read();
		}
		leerArchivo.close();
		return string;
	}

	public void Error(Nosirve ex){
		JOptionPane.showMessageDialog(this, "Upps ninguna palabra por aqui!", "No hay palabra", JOptionPane.CANCEL_OPTION);
	}

	public void ganar(){
		JOptionPane.showMessageDialog(this, "FELICIDADES HAS GANADO!!", "GANASTE", JOptionPane.INFORMATION_MESSAGE);
	}

	public void Revelar(){
		
		for(int i=0; i<botoncitos.size(); i++){
			botoncitos.get(i).setBackground(Color.GREEN);
			botoncitos.get(i).setBorder(new SoftBevelBorder(BevelBorder.LOWERED));	
		}
	}
}
