package first.codelines;

import java.util.Scanner;

public class ue_009_calculator {
	public static void main(String[] args) {
		//Aufrufen der Methode
		calcChoice();
	}
	
	//Neue Methode
	public static void calcChoice() {
		//Userinputs
		Scanner scan = new Scanner(System.in);
		System.out.println("Mit welcher Rechenart möchten Sie rechnen? (+, -, *, /) ");
		String userinput = scan.next();
		System.out.println("Geben Sie zwei Zahlen ein: ");
		int userinput2 = scan.nextInt();
		int userinput3 = scan.nextInt();
		
		//das ergebniss speicher und die letzte methode aufrufen
		int result = calc(userinput2, userinput3, userinput); 
		console(userinput2, userinput, userinput3, result);   
	}
	
	//Methode für alle Grundrechenarten
	public static int calc(int userinput2, int userinput3, String userinput) {
		
		//Plus
		if(userinput.equals("+")) {    
			int add = userinput2 + userinput3;
			return add;
		}
		//Minus
		else if(userinput.equals("-")) {  
			int sub = userinput2 - userinput3;
			return sub;
		}
		//Mal
		else if(userinput.equals("*")) { 
			int mul = userinput2 * userinput3;
			return mul;
		}
		//Dividiert
		else if(userinput.equals("/")) { 
			int div = userinput2 / userinput3;
			return div;
		}
		
		return 0; 
	}
	//Letze Methode zum ausgeben des ergebnisses
	public static void console(int input1, String input2, int input3, int result) {
		System.out.printf("%d %s %d = %d", input1, input2, input3, result);
	}
}	
