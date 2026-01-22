package basic_uebungen;

import java.util.Scanner;

public class ue_001_area {
	
	public static float[] user(Scanner scan) {
		System.out.println("Flächeninhalt Rechteck");
		System.out.print("Geben sie die länge ein: ");
		float lenght = scan.nextFloat();
		System.out.print("Geben sie die Breite ein: ");
		float width= scan.nextFloat();
		float [] numbers = {lenght, width};
		return numbers;
		
	}
	
	public static void area(float[] nums) {
		float area = nums[0] * nums[1];
		System.out.printf(" Der Flächeninhalt beträgt %.3f m² \n", area);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			float[] numbers = user(scan);
			area(numbers);
			}
		scan.close();
	}
}
