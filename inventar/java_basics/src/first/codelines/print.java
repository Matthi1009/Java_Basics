package first.codelines;
import java.util.Scanner;

public class print {
	public static void main(String[] args) {
//	//	System.out.println("Hallo"); //Mit Zeilenumbruch
//		System.out.print("Hallo"); //Ohne Zeilenumbruch
//		System.out.println("2IT");
//		String fach = "POS";
//		int semester = 2025;
//		System.out.printf("Wilkommen zu %s im WS %d mit Notenddurschnitt %.1f%n", fach, semester, 1.5); // so quasi f string mit %s nur platzhalter für string
//		System.out.printf("Hallo %s: %s", "Klasse", "2IT");
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("Gib deinen Namen ein: ");
		int name = scan.nextInt();
		
		System.out.println(name);
		
		String nachname = scan.nextLine();
		System.out.println("Nachname: " + nachname);
		
		
		 
		
		
		
		
		
	}

}
