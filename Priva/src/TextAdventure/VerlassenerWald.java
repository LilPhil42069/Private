package TextAdventure;

import java.util.Scanner;

public class VerlassenerWald {

	static String kampf;

	public static void main(String[] args) {
		boolean first = true;
		System.out.println("Du befindest dich im Verlassenen Wald");
		Variablen.bonusschadenwasser += 1;
		if (first == true) {
			first = false;
			start();
		}

	}

	static void start() {
		Scanner scan = new Scanner(System.in);
		System.out
				.println("Du scheinst einen Unfall gehabt zu haben. Du erinnerst dich nicht wie du hiergekommen bist\n"
						+ "Das einzige was du bei dir hast ist deine Kleidung ein Messer,welches leicht rostig ist und einen k\n"
						+ "Es ist sehr nebelig und du kannst du einige Meter vor dir sehen. Du bist von Größen Bäumen umgeben,\n"
						+ "welche weitestgehend den Himmel abdecken und es ziemlich dunkel im Wald macht.\n"
						+ "Zwar hörst du komische Geräusche wie das heulen eines Wolfes oder das zirpen von Grillen, aber\n"
						+ "du versuchst noch zu verstehen wie du hierhergekommen bist. Du schaust dich um und siehst rechts\n"
						+ "von dir einen Pfad. Und du gehst Ihn entlang. Jedoch musst du dich entscheiden ob du nach Links\n "
						+ "oder rechts gehen sollst. Leider ist kein Wegweiser oder ähnliches in der Nähe.\n"
						+ "Welche Richtung willst du gehen? links oder rechts?(links/rechts)");

		if (scan.next().equals("links")) {
			System.out.println("Du gehst also nach links. Du folgst dem Weg eine weile und langsam bemerktst du\n"
					+ "immer lauter werdene Geräusche und Schatten im Nebel, die ähnlichkeiten mit einem Schleim haben.\n"
					+ "Es scheint dich zu verfolgen und lässt nicht locker obwohl du immer schneller wirst.\n"
					+ "Du hast die Wahl. kämpfst oder fliehst du?(kämpfen/fliehen)");

			if (scan.next().equals("kämpfen")) {
				System.out.println("kämpfen");
				Kampf.main(null);
			} else {
				if (scan.next().equals("fliehen")) {
					System.out.println("Fucht gescheitert");
					Kampf.main(null);
				} else {
					System.out.println("Bitte schreibe eine erlaubte Eingabe");
				}
			}

		}
	}
}
