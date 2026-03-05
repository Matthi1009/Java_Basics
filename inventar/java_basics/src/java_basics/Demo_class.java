package java_basics;

import java.util.Scanner;

public class Demo_class {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] numbers = getNumbers(scan);
		System.out.println(numbers[1]);
		// >>>>>>>>>>>>>>>>>Arrays<<<<<<<<<<<<<<<<<
//		int[] number = new int[3]; // Deklaration
//		number[0] = 76; 		  // Initialisierung
//		number[1] = 44;
//		number[2] = 9;
		
//		System.out.println(number[1]);
//		System.out.println(number.length);
		
//		int[] number9 = {665, 666, 667};  //Definition
//		
//				
//		for (int i = 0; i < number9.length; i++) {
//	
//		System.out.println(number9[i]); 
			
		}		
		public static int[] getNumbers(Scanner scan) {
			System.out.println("Gib die 1. Zahl ein: ");
			int number1 = scan.nextInt();
			scan.nextLine();
			System.out.println("Gib die 2. Zahl ein: ");
			int number2 = scan.nextInt();
			
			return new int[] {number1, number2};
			
		}
	}
		
	
	
	
	




