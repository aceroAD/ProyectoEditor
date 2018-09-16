package actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.TextFile;

public class NewDocument implements ActionListener{

	private TextFile text;
	
	public NewDocument(TextFile textFile) {
		this.text = textFile;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.newDoc();
		
	}
	
	public void newDoc() {
		this.text.setTextBlank();
	}

}
