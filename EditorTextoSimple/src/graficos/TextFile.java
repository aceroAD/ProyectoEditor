package graficos;

import javax.swing.JTextArea;

public class TextFile extends JTextArea{
	
	private String fileName;
	
	public TextFile() {
		
		super();
		this.fileName = "aaa";
		
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public void setFileName(String newFileName) {
		this.fileName = newFileName;
	}

}
