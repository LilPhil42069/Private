package TextAdventure;

import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static Timer time = new Timer();

	public static void main(String[] args) {
		Inventar.main(args);
		startInfo();
		
		
	}

	static void startInfo() {
		System.out.println("Willkommen bei meinem Textadventure");
		System.out.println("Die Regeln sind einfach. Hinter der Frage steht in Klammern deine Antwortmöglichkeit.\n"
				+ "schreibe deine Antwort in die Konsole und bestätige mit Enter.");
		System.out.println("Bevor wir starten, nenne mir bitte deinen Namen");
		Variablen.name = scan.next();

		System.out.println("Dein Name ist " + Variablen.name);
		System.out.println("Ist das Richtig?(ja/nein)");
		if(scan.next().equals("ja")) {
			ort();
		}else{
			if(scan.next().equals("nein")){
				System.out.println("Bitte gib deinen Namen ein");
				Variablen.name = scan.next();
			}
		}
			
		}

	static void ort() {
		VerlassenerWald.main(null);

	}
}
