package Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keylistener implements KeyListener {
	public static void main(String[] args) {
		System.out.println("Keylistener");
	}
    char c = 'e';
	@Override
	public void keyPressed(KeyEvent kp) {
		System.out.println("keypressed");
		if(kp.getKeyCode() == KeyEvent.VK_W){
			System.out.println("move forward");
		}
		if(kp.getKeyCode() == KeyEvent.VK_S) {
			System.out.println("move backwards");
		}if(kp.getKeyCode() == KeyEvent.VK_D) {
			System.out.println("move right");
		}if(kp.getKeyCode() == KeyEvent.VK_A) {
			System.out.println("move left");
		}
	}

	@Override
	public void keyReleased(KeyEvent kr) {
		
	}

	@Override
	public void keyTyped(KeyEvent kt) {
		
	}

	
}
