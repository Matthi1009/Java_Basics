package casino;

public class Croupier extends Persons {
	
	public Croupier(String name) {
		super(name);
	}
	
	//Methode die prüft ob der Spieler genug credits hat
	public boolean validCredits(int credits, int bet, PLayer pLayer) {
		float num = credits / 2;
		if (bet > num) {
			System.out.println("Einsatz nicht akzeptiert");
			return false;
		} else {
			System.out.println("Einsatz akzeptiert");
			pLayer.placeCredits(bet);
			return true;
		}
	}
	
	
	//Methode von Persons die Ausgibt was der Spieler  tut
	@Override
	public boolean performRole() {
		System.out.println("Ich überwache die Spiele");
		return true;
	}
}
