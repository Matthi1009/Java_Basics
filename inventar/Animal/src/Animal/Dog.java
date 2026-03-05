package Animal;

public class Dog extends Animal {
	private String type;
	
	public Dog(String name, int age, String type) {
		super(name, age);
		this.type = type;
	
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s%n"
			+ "Alter: %d%n"
			+ "Rasse: %s%n", getName(), getAge(), type);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Der Hund macht Wuff Wuff \n");
	}
	
	
}
