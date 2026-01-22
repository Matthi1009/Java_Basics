package casino;

public class PLayer extends Persons {
	//Field
	private int credits;
	
	//Constuctor mit Filds der SuperKlasse und credits
	public PLayer(String name, int credits) {
		super(name);
		this.credits = credits;
	}
	
	//Getter
	public int getCredits() {
		return credits;
	}
	
	//Setter
	public int setCredits(int amount) {
		credits = amount;
		return credits;
	}

	//Methode zum hinbzufügen von credits
	public void addCredits(int increase) {
		if (increase > 0) {
			credits += increase;
		} else {
			System.out.println("Ungültig");
		}
	}
	
	//Methode zum setzen von credits
	public int placeCredits(int decrease) {
		if (credits > 0) {
		credits -= decrease;
		return decrease;
		} else {
			System.out.println("Fehler");
			return 0;
		}
	}
	
	//Methode von Persons die Ausgibt was der Spieler  tut
	@Override
	public boolean performRole() {
		if (credits > 0) {
			System.out.printf("Credits: %d %nName: %s %n", credits, getName());
			return true;
		} else {
			System.out.printf("Name: %s %nNicht genug Credits zum Spielen");
			return false;
		}
	}
	
	
}
