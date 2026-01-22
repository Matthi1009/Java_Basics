package first.codelines;

import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		loops();
	}
	
	
	
	
	public static void loops() {
		
		//for-schleife
		String s = "Hallo";
		//for zähler variable i, wie lang, i++ immmer + 1
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		//while-schleife
		int idx = 5;
		while(idx > 0) {
			System.out.println(idx);
			idx--;
		}
		
		//do-while-schleife
		Scanner scan = new Scanner(System.in);
		int userZahl;
		
		do {
			System.out.println("Gib eine Zahl ein: ");
			userZahl = scan.nextInt();
		}while(userZahl != 5);
	}
	
}

