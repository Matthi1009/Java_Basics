package basic_uebungen;

import java.util.Scanner;

public class ue_002_average {
	
	public static float[] user(Scanner scan) {
		System.out.println("Durschnitsrechner");
		System.out.print("Erste Zahl: ");
		int num = scan.nextInt();
		System.out.print("Zweite Zahl: ");
		int num2 = scan.nextInt();
		float [] numbers = {num, num2};
		return numbers;
		
	}
	
	public static void average(float[] numbers) {
		float average = (numbers[0] + numbers[1])/2; 
		System.out.printf("Der Durchschnit ist %f", average);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float[] numbers = user(scan);
		average(numbers);
		scan.close();
		
		
	}
	

}
