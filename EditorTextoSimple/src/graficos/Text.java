package graficos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Text extends JPanel{
	
	private TextFile editor;
	private JScrollPane scroll;
	
	public Text() {
		
		Font basicFont = new Font("Consolas", Font.PLAIN, 18);
		
		this.setLayout(new BorderLayout());
		this.setBackground(Color.RED);
		
		this.editor = new TextFile();
		this.scroll = new JScrollPane(this.editor);
		
		this.editor.setFont(basicFont);
		this.editor.setEditable(true);
		this.editor.setLineWrap(true);
		this.editor.setWrapStyleWord(true);
		
		this.add(this.scroll);
		this.editor.setVisible(true);
		
	}
	
	public TextFile getTextFile() {
		return this.editor;
	}
	public void setFileName(String fileName) {
		this.editor.setFileName(fileName);
	}
	
}
