package actionListeners;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import javax.swing.JFrame;
import javax.swing.JTextArea;

public class OpenDocument implements ActionListener{

	private JTextArea texto;
	public OpenDocument(JTextArea textArea) {
		super();
		texto = textArea;
	}
	public void actionPerformed(ActionEvent e) {
		FileDialog windowForLoad;
		windowForLoad = new FileDialog(new JFrame(), "Choose Doc", FileDialog.LOAD);
		windowForLoad.setVisible(true);
		this.display(windowForLoad.getDirectory() + windowForLoad.getFile());
	}
	
	public void display(String fileName) {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			
			while (line != null) {
				this.texto.append(line);
				this.texto.append(System.getProperty("line.separator"));
				line = reader.readLine();
			}
			reader.close();
		}catch (IOException e) {
			System.exit(0);
		}
		
		
	}

	
}
