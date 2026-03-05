package first.codelines;

import java.time.Year;
import java.util.Scanner;

public class switchCase {
	public static void main(String[] args) {
		askForNumbers();
		
	}
	
	
	
	public static void askForNumbers() {
		
		System.out.println("Magst du Ritschert?/n"
		+ "j = ja\n"
		+ "n = nein\n"
		+ "=============> ");
		
		Scanner scan = new Scanner(System.in);
		String decision = scan.nextLine();
		//ternary verzweigung
		String yesOrNo = (decision.equals("j")) ? "ja" : "nein";
		System.out.println(yesOrNo);
	
	
//		switch (decision) {
//			case "j":
//				System.out.println("Sehr gut!");
//				break;
//			case "n":
//				System.out.println("Uncool");
//				break;
//			case "v":
//				System.out.println("Ok");
//				break;
				
		
//		switch (decision) {
//			case "j" -> System.out.println("Sehr gut!");
//			case "n" -> System.out.println("Uncool");
//			case "v" -> System.out.println("Ok");
		
			
						
		
		
		
	}

}
