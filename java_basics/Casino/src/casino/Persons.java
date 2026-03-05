package casino;

public abstract class Persons {
	//Field
	private String name;
	
	//Constructor
	public Persons(String name) {
		this.name = name;
	}
	
	//Getter
	public String getName() {
		return name;
	}
	
	//Abstracte Klasse für Player und Croupier
	public abstract boolean performRole();
}
