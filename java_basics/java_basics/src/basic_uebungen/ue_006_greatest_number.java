package basic_uebungen;

import java.util.Scanner;

public class ue_006_greatest_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float[] num = user(scan);
		greatestNumber(num);
		scan.close();
		
	}
	public static float[] user(Scanner scan) {
		System.out.println("Gib eine Zahl ein: ");
		float user1 = scan.nextFloat();
		System.out.println("Gib noch eine Zahl ein: ");
		float user2 = scan.nextFloat();
		System.out.println("Gib noch eine Zahl ein: ");
		float user3 = scan.nextFloat();
		float[] numbers = {user1, user2, user3};
		return numbers;
	}
	public static void greatestNumber(float[] numbers) {
		if (numbers[0] > numbers[1] && numbers[0] > numbers[2]) {
			System.out.printf("Die größte Zahl ist: %.2f", numbers[0]);
		} else if (numbers[1] > numbers[0] && numbers[1] > numbers[2]) {
			System.out.printf("Die größte Zahl ist: %.2f", numbers[1]);
		} else if (numbers[2] > numbers[0] && numbers[2] > numbers[1]) {
			System.out.printf("Die größte Zahl ist: %.2f", numbers[2]);
		} else {
			System.out.println("Alle gleich oder ungültig");
		}

}
}
