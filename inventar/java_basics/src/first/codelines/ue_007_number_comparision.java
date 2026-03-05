package first.codelines;

import java.util.Scanner;

public class ue_007_number_comparision {
	public static void main(String[] args) {
		//Scanner erstellen und userinputs abfragen
		Scanner scan = new Scanner(System.in);
		System.out.print("Gib zewi Zahlen zum vergleichen ein! ");
		int userinput = scan.nextInt();
		int userinput2 = scan.nextInt();
		
		//die erstellten funktionen ausgeben
		comparisionEven(userinput, userinput2);
		comparisionNotEven(userinput, userinput2);
		comparisionBigger(userinput, userinput2);
		comparisionSmaller(userinput, userinput2);
		comparisionBiggerAnd(userinput, userinput2);
		comparisionSmallerAnd(userinput, userinput2);
		
		
		
	}
	
	
	//neue methode gleich
	public static void comparisionEven(int userinput, int userinput2) {
		boolean status = userinput == userinput2;
		System.out.printf("Sind %d und %d gleich: %b \n", userinput, userinput2, status);
		
		
	}
	//neue Methode ungleich
	public static void comparisionNotEven(int userinput, int userinput2) {
		boolean status = userinput != userinput2;
		System.out.printf("Sind %d und %d ungleich: %b \n", userinput, userinput2, status);
		
		
	}
	//neue Methode größer
	public static void comparisionBigger(int userinput, int userinput2) {
		boolean status = userinput > userinput2;
		System.out.printf("Ist %d größer als %d: %b \n", userinput, userinput2, status);
		
		
	}
	//neue Methode kleiner
	public static void comparisionSmaller(int userinput, int userinput2) {
		boolean status = userinput < userinput2;
		System.out.printf("Ist %d kleiner als %d: %b \n", userinput, userinput2, status);
		
		
	}
	//neue Methode größer gleich
	public static void comparisionBiggerAnd(int userinput, int userinput2) {
		boolean status = userinput >= userinput2;
		System.out.printf("Ist %d größer oder gleich als %d: %b \n", userinput, userinput2, status);
		
		
	}
	//neue Methode kleiner gleich
	public static void comparisionSmallerAnd(int userinput, int userinput2) {
		boolean status = userinput <= userinput2;
		System.out.printf("Ist %d kleiner oder gleich als %d: %b \n", userinput, userinput2, status);
		
		
	}
	

		
		

}
