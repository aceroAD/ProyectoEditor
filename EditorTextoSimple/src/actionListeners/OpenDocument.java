package actionListeners;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import javax.swing.JFrame;

import graficos.TextFile;

public class OpenDocument implements ActionListener{

	private TextFile texto;
	
	public OpenDocument(TextFile textArea) {
		super();
		texto = textArea;
	}
	public void actionPerformed(ActionEvent e) {
		FileDialog windowForLoad;
		windowForLoad = new FileDialog(new JFrame(), "Choose file to open", FileDialog.LOAD);
		windowForLoad.setVisible(true);
		this.display(windowForLoad.getDirectory() + windowForLoad.getFile());
		System.out.println(this.texto.getFileName());
		
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
		} catch (IOException e) {
			System.exit(0);
		}
		this.texto.setFileName(fileName);
	}
}
