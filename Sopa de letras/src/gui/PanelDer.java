package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;

import javax.swing.JPanel;

public class PanelDer extends JPanel {
	private PanelPalabras palabras;

	public PanelDer() throws IOException {
		// TODO Auto-generated constructor stub
		super.setBackground(Color.GRAY);
		super.setLayout(new BorderLayout());
		palabras = new PanelPalabras();
		palabras.setPreferredSize(new Dimension(250, 400));
		super.add(palabras);
	}

}
