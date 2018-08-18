package graficos;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Rectangle;

import javax.swing.*;

public class Text extends JPanel{
	
	private JTextArea editor;
	
	public Text(int width, int height) {
		
		//super(layout);
		this.setLayout(null);
		this.setBounds(100, 0, width, height);
		this.setBackground(Color.RED);
		
		this.editor = new JTextArea();
		this.editor.setBounds(0,0,width, height);
		this.editor.setEditable(true);
		this.editor.setLineWrap(true);
		this.editor.setWrapStyleWord(true);
		
		this.add(this.editor);
		this.editor.setVisible(true);
		
	}
	
}
