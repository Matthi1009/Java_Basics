package exceptions;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean  checkInput = false;
		int age = -1;
		while(!checkInput)	{     //chekcInput == false
			
		
		try {
			System.out.print("Geben Sie Ihr alter ein: ");
			age = scan.nextInt();
			checkAge(age);
			checkInput = true;
		}catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			scan.nextLine();
		}catch (Exception ex) {
			System.out.println("Falsche Eingabe! Bitte eine Zahl eingeben " + ex.getClass().getSimpleName());
			scan.nextLine();
		}
	}
		System.out.println(age);
		System.out.println("Ende Programm");
		scan.close();
		
	}
	
	public static void checkAge(int age) {
		if (age <0) {
			throw new IllegalArgumentException("Das Alter kann nicht negativ sein!");
		}
	}
}
