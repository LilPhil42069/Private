package TextAdventure;


public class Schleim {
	final static int schaden = 2;
	final static String typ = "wasser";
	static int leben = 5;

	public static void main(String[] args) {

	}

	static void item() {
		System.out.println("Du erhälst einen kleinen Trank");
		KleinerTrank.anzahl += 1;
		System.out.println("Du erhälst 2 Erfahrungspunkte");
		Variablen.aktuelleErfahrung += 1;
	}

}
