package graficos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Rectangle;

import javax.swing.*;

public class Text extends JPanel{
	
	private JTextArea editor;
	private JScrollPane scroll;
	
	public Text(int width, int height) {
		
		Font basicFont = new Font("Consolas", Font.PLAIN, 18);
		
		this.setLayout(new BorderLayout());
		this.setBackground(Color.RED);
		
		this.editor = new JTextArea();
		this.scroll = new JScrollPane(this.editor);
		
		this.editor.setFont(basicFont);
		this.editor.setEditable(true);
		this.editor.setLineWrap(true);
		this.editor.setWrapStyleWord(true);
		
		this.add(this.scroll);
		this.editor.setVisible(true);
		
	}
	
}
