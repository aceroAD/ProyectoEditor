package actionListeners;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class OpenDocument implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		FileDialog windowForLoad;
		windowForLoad = new FileDialog(new JFrame(), "Choose Doc", FileDialog.LOAD);
		windowForLoad.setVisible(true);
		
	}

}
