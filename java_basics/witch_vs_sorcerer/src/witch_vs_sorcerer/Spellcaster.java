package witch_vs_sorcerer;

public class Spellcaster {
	// Fields
	private String name;
	private String typ;
	private int energy;
	
	// Konstruktor
	public Spellcaster(String name, String typ) {
		this.name = name;
		this.typ = typ;
		this.energy = 50; 
	}
	
	
	// Getter
	public String getName() {
		return name;
	}
	
	public String getTyp() {
		return typ;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	// Setter
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
	public void heal() {
        //Random zahl für Heilzauber
        int heal = (int) (Math.random() * (20 - 10 + 1)) + 10;
        energy += heal;
        System.out.printf("%s heilt sich um %d Punkte. Energie jetzt: %d\n", name, heal, energy);
    }

    public void attack(Spellcaster opponent) {
        //random zahl für atacke
        int dmg = (int) (Math.random() * (25 - 10 + 1)) + 10;
        opponent.energy -= dmg;

        // Energie kann nicht negativ werden
        if (opponent.energy < 0) {
            opponent.energy = 0;
        }

        System.out.printf("%s greift %s an und verursacht %d Schaden. Gegner-Energie: %d\n",
                name, opponent.name, dmg, opponent.energy);
    }
    
    public void animal() {
    	//array mit allen tieren und farben
    	String[] color = {"Mitternachtsblau", "Flammenrot", "Smaragdgrün", "Sonnenburst-Gold", "Drachenviolett", "Polarlicht-Türkis", "Schattengrau", "Kristallsilber", "Magmagelb", "Traumrosa"};
    	int num = (int) (Math.random() * (9 - 0 + 1)) + 0;
    	String[] animals = {"Phönix", "Donnerwolf", "Kristalldrache", "Schattenpanther", "Feuerfalke", "Sturmhirsch", "Eisfuchs", "Mondschildkröte", "Blitzgreif", "Nebelpython"};
    	
    	System.out.printf("%s hat sich in ein %s in %s verwandelt. \n", name, animals[num], color[num]);
    }
	
}