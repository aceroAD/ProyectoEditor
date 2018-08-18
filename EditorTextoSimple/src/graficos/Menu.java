package graficos;
import javax.swing.*;

public class Menu extends JMenuBar{
	
	private JMenu archivo;
	private JMenu estilos;
	
	public Menu() {
		
		this.archivo = new JMenu("Archivo");
		this.estilos = new JMenu("Estilos");
		
		this.add(archivo);
		this.add(estilos);
		
		//contruct Archivo menu
		this.archivo.add(new JMenuItem("New Document"));
		this.archivo.add(new JSeparator());
		this.archivo.add(new JMenuItem("Save"));
		this.archivo.add(new JSeparator());
		this.archivo.add(new JMenuItem("Save as"));
		this.archivo.addSeparator();
		this.archivo.add(new JMenuItem("Exit"));
		
		//contruct style menu
		this.estilos.add(new JMenuItem("Font"));
		this.estilos.addSeparator();
		this.estilos.add(new JMenuItem("Size"));
		
	}

}
