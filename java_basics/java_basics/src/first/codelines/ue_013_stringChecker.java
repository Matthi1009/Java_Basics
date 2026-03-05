package first.codelines;

import java.util.Scanner;

public class ue_013_stringChecker {
	public static void getStrings(Scanner scan) {
		//inputs mit scanner
		System.out.println("Gib einen String ein: ");
		String user = scan.nextLine();
		System.out.println("Gib einen zweiten String ein: ");
		String user2 = scan.nextLine();
		
		//methode aufruf
		stringChecker(user, user2);
	}
	
	public static void  stringChecker(String user, String user2) {
		//überprüft ob die strings gleich sind
		boolean ident = user.equals(user2);
		System.out.printf("Sind die Strings ident? %b \n", ident);
		
		//überpüft ob die Strings gleich lang sind
		boolean length = user.length() == user2.length();
		System.out.printf("Sind die Strings gleich lang? %b \n", length);
		
		//überprüft welcher string länger ist oder beide gleich
		if(user.length() > user2.length()) {
			System.out.println("String 1 ist länger");
		}else if(user.length() < user2.length()){
			System.out.println("String 2 ist länger");
		}else {
			System.out.println("Beide sind gleich lang");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		getStrings(scan);
		
		
		
	}

}
