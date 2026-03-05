package Athlete;


public class basejumper extends athlete {
	private int nearest_to_ground;
	
	public basejumper(String name, int age, int nearest_to_ground) {
		super(name, age);
		this.nearest_to_ground = nearest_to_ground;
	}
	
	public int getNearestToGround() {
		return nearest_to_ground;
	}
	
	public void jump() {
	    int randomDistance = (int)(Math.random() * 16) + 5; 
	    System.out.printf("Basejumper springt! Minimaler Abstand zum Boden: %d m%n", randomDistance);

	    if (randomDistance < nearest_to_ground) {
	        nearest_to_ground = randomDistance;
	        System.out.printf("Neuer Rekord! Nächstes Mal noch näher zum Boden: %d m%n", nearest_to_ground);
	    } else {
	        System.out.println("Kein Rekord diesmal, nächster Sprung wird besser!");
	    }
	}

	
	@Override
	public void practice(double minutes) {
		super.practice(minutes);
		System.out.printf("Der Basejumper macht einen Versuch \n");
	}
	
	@Override
	public void celebrate() {
		System.out.println("Der Basejumper macht einen Siegestanz.");
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + "Nähe zum Boden: %d%n", nearest_to_ground);
		
		
		
	}

}
