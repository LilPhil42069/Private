package TextAdventure;

import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static Timer time = new Timer();
	public static void main(String[] args) {
		startInfo();
		ort();
	}

	static void startInfo() {
		System.out.println("Willkommen bei meinem Textadventure");
		System.out.println("Bevor wir starten, nenne mir bitte deinen Namen");
		Variablen.name = scan.next();

		System.out.println("Dein Name ist " + Variablen.name);
	
	//Abfrage ob der Name richtig eingegeben wurde!!!
	/*	if (scan.next() == "ja") {

		}
		if (scan.next() == "nein") {
			System.out.println("Bitte gib deinen Namen ein");
			Variablen.name = scan.next();
		}*/
	}
	
	static void ort() {
	VerlassenerWald wald = new VerlassenerWald();
	wald.main(null);
	
	}
}






