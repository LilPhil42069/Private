package Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keylistener implements KeyListener {
	public static void main(String[] args) {

		System.out.println("Keylistener");
	}

	
	public static int x;
    int c = Bodydraw.x;
	public Keylistener(int x) {
		this.x = x;
		this.x = Snake.x;
	}

	@Override
	public void keyPressed(KeyEvent kp) {
		System.out.println("keypressed method");
		switch (kp.getKeyCode()) {
		case KeyEvent.VK_W:
			c += 100;
			System.out.println("move forward (line 16)");

			break;
		case KeyEvent.VK_S:
			System.out.println("move backward (line 19)");
			break;
		case KeyEvent.VK_A:
			System.out.println("move left (line 22)");
			break;
		case KeyEvent.VK_D:
			System.out.println("move right (line 25)");
			break;

		}
	}

	@Override
	public void keyReleased(KeyEvent kr) {

	}

	@Override
	public void keyTyped(KeyEvent kt) {

	}

}
