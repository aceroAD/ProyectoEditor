package graficos;
import javax.swing.*;
import actionListeners.*;

public class Menu extends JMenuBar{
	
	private JMenu archivo;
	private JMenu estilos;
	
	public Menu(TextFile editor) {
		
		this.archivo = new JMenu("Archivo");
		this.estilos = new JMenu("Estilos");
		
		this.add(archivo);
		this.add(estilos);
		
		//Menu Items for archivo
		JMenuItem open = new JMenuItem("Open");
		JMenuItem newDoc = new JMenuItem("New Document");
		JMenuItem save =new JMenuItem("Save");
		JMenuItem saveAs =new JMenuItem("Save as");
		JMenuItem exit =new JMenuItem("Exit");
		
		//Menu Items for estilos
		JMenuItem font = new JMenuItem("Font");
		JMenuItem fontSize =new JMenuItem("Font Size");
		
		//contruct Archivo menu
		this.archivo.add(open);
		this.archivo.addSeparator();
		this.archivo.add(newDoc);
		this.archivo.add(new JSeparator());
		this.archivo.add(save);
		this.archivo.add(new JSeparator());
		this.archivo.add(saveAs);
		this.archivo.addSeparator();
		this.archivo.add(exit);
		
		//contruct style menu
		this.estilos.add(font);
		this.estilos.addSeparator();
		this.estilos.add(fontSize);
		
		//anadir acciones
		OpenDocument openDoc = new OpenDocument(editor);
		open.addActionListener(openDoc);
		
		SaveAsDocument saveAsDoc = new SaveAsDocument(editor);
		saveAs.addActionListener(saveAsDoc);
		
		SaveAction saveDoc = new SaveAction(editor);
		save.addActionListener(saveDoc);
		
		newDoc.addActionListener(new NewDocument(editor));
		exit.addActionListener(new ExitProgram());
	}

}
