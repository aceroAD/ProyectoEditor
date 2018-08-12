package graficos;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{
	
	public PanelPrincipal() {
		super();
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.draw(rectangulo);
		
	}
}
