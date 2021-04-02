package TextAdventure;

import java.util.*;

public class Inventar {

	private static ArrayList<Object> inventar;
	public static void main(String[] args) {
		inventar = new ArrayList<Object>();
		KleinerTrank ktrank = new KleinerTrank(KleinerTrank.stärke,KleinerTrank.anzahl);
		inventar.add(ktrank);
		
		
		
	}
	static void inventarAuflisten() {
		for (int i = 0; i < inventar.size(); i++) {
			System.out.println(inventar.get(i).toString());
		}
	}
}
