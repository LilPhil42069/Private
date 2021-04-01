package TextAdventure;

import java.util.*;

public class Stadt {
	final int Stadt_id = 1;
	private static Random r = new Random();

	public static void main(String[] args) {
		System.out.println("Du befindest dich nun in der Stadt");
		Variablen.ort = "Stadt";
		wetter();
	}

	public static void wetter() {
		int num = r.nextInt(2) + 1;
		switch (num) {
		case 1:
			System.out.println("Das Wetter ist sonnig");
			Variablen.bonusschadenfeuer += 1;
			break;
		case 2:
			System.out.println("Das Wetter ist stürmisch");
			Variablen.bonusschadenluft += 1;
			break;
		case 3:
			System.out.println("Es regnet");
			Variablen.bonusschadenwasser += 1;
			break;
		}
	}
}
