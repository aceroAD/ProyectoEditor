package graficos;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;

public class CreacionMarcos extends JFrame{
	
	private int width;
	private int height;
	private int posicionCentroX;
	private int posicionCentroY;
	
	//zones editor
	private Menu menu;
	private Text editorTexto;
	private LeftMenu leftMenu;
	
	
	public CreacionMarcos() {
		//pantalla podria ser atributo??
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension screenSize = pantalla.getScreenSize();
		
		this.width = screenSize.width / 2;
		this.height = screenSize.height / 2;
		this.posicionCentroX = screenSize.width / 4;
		this.posicionCentroY = screenSize.height / 4;
		
		this.menu = new Menu();
		this.leftMenu = new LeftMenu();
		
		
		//construyendo el marco
		this.setBounds(posicionCentroX, posicionCentroY, width, height); //se podria usar setLocation quitrando el tama�o pero habria que a�adir setSize
		this.setTitle("Nuevo Editor de Texto");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(menu);
		
	
		
		//contruyendo panel
		this.editorTexto = new Text(width, height);
		this.add(editorTexto,BorderLayout.CENTER);
		this.add(this.leftMenu, BorderLayout.WEST);
	
		this.setVisible(true);
		
	}
	
}
