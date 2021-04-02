package TextAdventure;

import java.util.Scanner;

public class Kampf {
	static boolean gewonnen;

	public static void main(String[] args) {
		boolean beendet = false;
		while (beendet == false) {
			Variablen.Leben = Variablen.Leben - (Schleim.schaden + Variablen.bonusschadenwasser);
			System.out.println("du:" + Variablen.Leben);
			Schleim.leben = Schleim.leben - 3;
			System.out.println("Gegner: " + Schleim.leben);
			if (Variablen.Leben <= 0) {
				System.out.println("Sie haben verloren");
				beendet = true;
				gewonnen = false;
			}
			if (Schleim.leben <= 0) {
				System.out.println("Sie haben gewonnen");
				beendet = true;
				Schleim.item();
				
				gewonnen = true;
				int zahl = Variablen.maxLeben / 2;

				if (Variablen.Leben <= zahl) {
					System.out.println("möchstest du einen Trank nutzen?(ja/nein)");
					Inventar.inventarAuflisten();
				}
				Scanner scan = new Scanner(System.in);
				if (scan.next().equals("ja")) {
					System.out.println("ja");
					KleinerTrank.anzahl -= 1;
					Variablen.Leben += 10;
					Inventar.inventarAuflisten();
				}
			}
			
		}

	}
}






