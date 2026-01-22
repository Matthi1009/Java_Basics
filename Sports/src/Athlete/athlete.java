package Athlete;

public class athlete {
	private String name;
	private int age;
	private double train_minutes;
	private int fitness_level;
	
	public athlete(String name, int age) {
		this.name = name;
		this.age = age;
		this.train_minutes = 0;
		this.fitness_level = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getTrainMinutes() {
		return train_minutes;
	}
	
	public int getFitnessLevel() {
		return fitness_level;
	}
	
	public void practice(double minutes) {
		train_minutes += minutes;
		System.out.printf("Der  Athlet hat %.2f minuten trainiert. %n", minutes);
		if (fitness_level < 100) {
		int random_num = (int) (Math.random() * (5 - 1 + 1)) + 1;
		fitness_level += random_num;
		if (fitness_level >= 100) {
			fitness_level = 100;
		}
		
		} else {
			System.out.println("Maximales Level erreicht!");
		}
	}
	
	public void celebrate() {
		System.out.println("Juhu \n");
	}
	
	@Override
	public String toString() {
		return String.format("Name : %s%n"
				+ "Alter: %d%n"
				+ "Trainierte Minuten: %.2f%n"
				+ "Fitnesslevel: %d%n", name, age, train_minutes, fitness_level);
	}
}
