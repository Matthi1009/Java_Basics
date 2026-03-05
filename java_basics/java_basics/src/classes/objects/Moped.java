package classes.objects;

// Signature
public class Moped {
// Fields
	private String model;
	private String color;
	private String engine;
	private int startSpeed;	
// Constructor
	public Moped(String model, String color, String engine) {
		this.model = model;
		setColor(color);
		this.engine = engine;
		startSpeed = 0;
		
	}
// Getter (Accessor)
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public int getStartSpeed() {
		return startSpeed;
	}
	
// Setter (Mutator)
	public void setColor(String color) {
		this.color = color;
		
	}
	
	public void setEngine(String engine) {
		
	}
	
}
