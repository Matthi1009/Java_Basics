package Athlete;

public class runner extends athlete {
	private double personal_best;
	
	public runner(String name, int age) {
		super(name, age);
		this.personal_best = 50;
	
	}
	
	public double getPersonalBest() {
		return personal_best;
	}
	
	@Override
	public void practice(double minutes) {
		super.practice(minutes);
		System.out.println("Der Läufer hat den 100 Meter Lauf trainiert. \n");
		}
	
	public void compete() {
	    double random_num = (double)(Math.random() * 5) + (personal_best - 2);
	    if (random_num < personal_best) {
	        personal_best = random_num;
	        System.out.printf("Record gebrochen! Neuer Record %.3f sekunden %n", personal_best);
	    } else {
	        System.out.println("Nächstes mal wirds besser! ");
	    }
	}
	
	@Override
	public void celebrate() {
		System.out.println("Der Läufer macht einen Purzelbaum");
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + "Persönliche Bestzeit: %.2f Sekunden %n", personal_best);
	}
	}
	
