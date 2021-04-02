package Snake;

import java.awt.Component;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Snake extends JFrame {
	static int x = Bodydraw.x;

	public Snake() {

	}

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		Keylistener kl = new Keylistener(x);
		Bodydraw body = new Bodydraw(x, 30, 30, 30);
		jf.setSize(500, 550);
		jf.setVisible(true);
		jf.setFocusable(true);
		jf.setLocationRelativeTo(null);
		jf.addKeyListener(kl);
		jf.add(body);
	}

}
