package Snake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Bodydraw extends JPanel {
	public static int x,y,l,b;
	
	public Bodydraw(int xx,int yy, int ll, int bb) {
		this.x = xx;
		this.y = yy;
		this.l = ll;
		this.b= bb;
	}
	
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawOval(x, y, l, b);
	g.setColor(Color.BLACK);
	repaint();

}
}
