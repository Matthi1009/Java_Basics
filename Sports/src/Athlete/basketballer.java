package Athlete;

public class basketballer extends athlete{
	private double height;
	
	public basketballer(String name, int age, double height) {
		super(name, age);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void dunking() {
		System.out.println("Der Basketballer macht einen Dunk \n");
	}
	
	@Override
	public void practice(double minutes) {
		super.practice(minutes);
		System.out.printf("Der wirft ein paar Körbe. %n");
	}
	
	@Override
	public void celebrate() {
		System.out.println("Der Basketballer macht einen Tanz.");
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + "Größe: %s meter %n", height);
		
		
		
	}
	

}
