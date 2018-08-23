package actionListeners;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import graficos.TextFile;

public class SaveAsDocument implements ActionListener {

	private TextFile text;
	
	public SaveAsDocument(TextFile editor) {
		this.text = editor;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		FileDialog windowExplorer;
		windowExplorer = new FileDialog(new JFrame(), "Choose Doc", FileDialog.SAVE);
		windowExplorer.setVisible(true);
		
		this.saveAs(windowExplorer.getDirectory() + windowExplorer.getFile());
		this.text.setFileName(windowExplorer.getFile());
		
	}
	
	public void saveAs(String fileName) {
		try {
		PrintWriter writer = new PrintWriter(fileName);
		writer.print(this.text.getText());
		
		writer.close();
		}catch (IOException e) {
			System.exit(0);
		}
		
	}

}
