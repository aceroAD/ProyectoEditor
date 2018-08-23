package actionListeners;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;

import graficos.TextFile;

public class SaveAction implements ActionListener{

	private TextFile text;
	private String fileName;
	
	public SaveAction(TextFile textArea) {
		super();
		this.text = textArea;
		fileName = this.text.getFileName();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Path path = Paths.get(this.fileName);
		System.out.println(this.fileName);
		if(Files.exists(path)) {
			this.save(this.fileName);
			
		}
		else {
			FileDialog fileChooser = new FileDialog(new JFrame(), "Select save file", FileDialog.SAVE );
			fileChooser.setVisible(true);
			this.save(fileChooser.getDirectory() + fileChooser.getFile());
			this.text.setFileName(fileChooser.getFile());
		}
		
	}
	
	public void save(String fileName) {
		try {
		PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, false));
		writer.write(this.text.getText());
		writer.close();
		
		}catch (FileNotFoundException e) {
			System.out.println("File not found");
			
		}catch (IOException e) {
			
			System.out.println("error" + e.getMessage());
		}
		
	}
	
}
