package graficos;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;


public class LeftMenu extends JPanel{

	private JPanel panelIzq;
	public LeftMenu() {
		
		this.panelIzq = new JPanel();
		this.panelIzq.setPreferredSize(new Dimension(200, this.getMaximumSize().height));
		
		this.add(panelIzq);		
	}
}
