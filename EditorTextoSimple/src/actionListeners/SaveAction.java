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
	
	public SaveAction(TextFile textArea) {
		this.text = textArea;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (this.text.getFileName() == null) {
			this.fileChooser();
		}
		else {
			Path path = Paths.get(this.text.getFileName());
			if(!Files.exists(path)) {
				this.fileChooser();
			}
			else {
				this.save(this.text.getFileName());
			}
		}
	}
	
	private void save(String fileName) {
		try {
		PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, false));
		writer.write(this.text.getText());
		writer.close();
		
		}catch (IOException e) {
			
			System.out.println("error" + e.getMessage());
		}
		
	}
	
	private void fileChooser() {
		FileDialog fileChooser = new FileDialog(new JFrame(), "Select save file", FileDialog.SAVE );
		fileChooser.setVisible(true);
		this.save(fileChooser.getDirectory() + fileChooser.getFile());
		this.text.setFileName(fileChooser.getDirectory() + fileChooser.getFile());	
	}
	
}
