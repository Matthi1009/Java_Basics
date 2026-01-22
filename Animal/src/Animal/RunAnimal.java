package Animal;

public class RunAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog("Rudi", 13, "Dackel");
		Fish fish = new Fish("Franz", 12, 230);
		
		System.out.println(dog);
		dog.makeNoise();
		System.out.println(fish);
		fish.makeNoise();
	}
}
