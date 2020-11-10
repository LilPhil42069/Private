package Snake;
import java.awt.Component;

import javax.swing.JFrame;

public class Snake extends JFrame {

	public static void main(String[] args)  {
      JFrame jf = new JFrame();
      Keylistener kl = new Keylistener();
      jf.setSize(500, 550);
      jf.setVisible(true);
      jf.setFocusable(true);
      jf.setLocationRelativeTo(null);
      jf.addKeyListener(kl);
	}

}
