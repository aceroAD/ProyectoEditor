package graficos;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;

public class CreacionMarcos extends JFrame{
	
	private int width;
	private int height;
	private int posicionCentroX;
	private int posicionCentroY;
	private Menu menu;
	private JPanel panelPrincipal;
	private Text texto;
	
	public CreacionMarcos() {
		//pantalla podria ser atributo??
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension screenSize = pantalla.getScreenSize();
		
		this.width = screenSize.width / 2;
		this.height = screenSize.height / 2;
		this.posicionCentroX = screenSize.width / 4;
		this.posicionCentroY = screenSize.height / 4;
		
		this.menu = new Menu();
		this.texto = new Text();
		
		
		//construyendo el marco
		this.setBounds(posicionCentroX, posicionCentroY, width, height); //se podria usar setLocation quitrando el tama�o pero habria que a�adir setSize
		this.setTitle("Nuevo Editor de Texto");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(menu);
		this.add(texto);
		
		//this.setResizable(false); --> por defecto es true.
		
		//contruyendo panel
	
		
		
	}
	
}
