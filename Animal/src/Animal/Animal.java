package Animal;

public class Animal {
	//Fields
	private String name;
	private int age;
	
	
	
	//constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public int getOlder() {
		return age += 1;
	}
	
	public void makeNoise() {
		System.out.println("Das Tier macht ein Geräusch");
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("Name: %s%n"
			+ "Alter: %d%n", name, age);
	}
}
