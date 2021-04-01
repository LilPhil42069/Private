package Mindmap;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

public class Roundedborder implements Border {
	private int radius;
	public Roundedborder(int radius) {
		this.radius = radius;
	}

	@Override
	public Insets getBorderInsets(Component c) {
		return new Insets(this.radius +1,this.radius +1,this.radius + 2,this.radius);
	}

	@Override
	public boolean isBorderOpaque() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int witdh, int height) {
		g.drawRoundRect(x ,y ,witdh -1,height -1,radius, radius);
	}

	

}
