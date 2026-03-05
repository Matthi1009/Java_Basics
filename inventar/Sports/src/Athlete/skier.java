package Athlete;

public class skier extends athlete {
	private int personal_best;
	
	public skier(String name, int age, int personal_best) {
		super(name, age);
		this.personal_best = personal_best;
	}
	
	public int getPersonalBest() {
		return personal_best;
	}
	
	public void skierRun(int speed, int snow) {
	    
	    System.out.println("Der Skier fährt los...");

	    if (speed > 20) {
	        System.out.println("Der Skier wird schnell und macht einen kleinen Sprung! \n");
	    } else if (snow == 1) {
	        System.out.println("Perfekter Schnee! Der Skier gleitet sauber den Hang hinunter. \n");
	    } else {
	        System.out.println("Der Skier fährt vorsichtig wegen der Bedingungen. \n");
	    }
	}
	
	@Override
	public void practice(double minutes) {
		super.practice(minutes);
		System.out.printf("Der Skier ist die Abfahrt gefahren. %n%n");
	}
	
	@Override
	public void celebrate() {
		System.out.println("Der Skier freut sich.");
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + "Bestzeit: %d sekunden.%n", personal_best);
		
		
		
	}

}
