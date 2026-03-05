package basic_uebungen;

import java.util.Scanner;

public class ue_003_division {
	
	public static int[] user(Scanner scan) {
		System.out.println("Division");
		System.out.println("Dividend: ");
		int num = scan.nextInt();
		System.out.println("Divisor: ");
		int num2 = scan.nextInt();
		int[] numbers = {num, num2};
		return numbers;
	}
	
	public static void division(int[] number) {
		int result = number[0] / number[1];
		int rest = number[0] % number[1];
		System.out.printf("Das ergebnis der Division ist %d und der Rest bträgt %d", result, rest);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numbers = user(scan);
		division(numbers);
		scan.close();
	}
}
