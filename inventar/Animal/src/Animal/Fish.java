package Animal;

public class Fish extends Animal {
	private int lenght;
	
	public Fish(String name, int age, int lenght) {
		super(name, age);
		this.lenght = lenght;
	}
	
	public int getLenght() {
		return lenght;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s%n"
			+ "Alter: %d%n"
			+ "Länge: %s%n", getName(), getAge(), lenght);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Der Fisch macht Blub Blub \n");
	}
	

}
