package basic_uebungen;

import java.lang.Math;
import java.util.Scanner;

public class ue_005secretNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = randomNumber();
		guess(num, scan);
		scan.close();
	}
	
	public static int randomNumber() {
		int randomnum = (int)(Math.random() * (100 - 0 + 1)) + 0;
		return randomnum;
	}
	
	public static void guess(int num, Scanner scan) {
		while (true) {
		System.out.printf("Rate eine Zahl von 0 - 100: ");
		int user_num = scan.nextInt();
		if (user_num == num) {
			System.out.println("Glückwunsch");
			System.out.printf("Willst du nochmal spielen? (ja/nein) ");
			String user_num_2 = scan.next();
			if (user_num_2.equals("nein")) {
				System.out.println("Tschüss");
				break;
			} else if (user_num_2.equals("ja")) {
				System.out.println("Viel Spaß");
			}
			
		} else if (user_num < num) {
			System.out.println("Die Zahl ist größer");
		} else if (user_num > num) {
			System.out.println("Die Zahl ist kleiner");
		} else {
			System.out.println("ungültig");
		}
	}
		
}
}
