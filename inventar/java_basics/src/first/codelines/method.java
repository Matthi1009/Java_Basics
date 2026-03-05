package first.codelines;
import java.util.Scanner;



public class method {
	public static void main(String[] args) {
		askForNumbers();
		
	}
	
	public static void askForNumbers() {
		int defaultNumber = 100;
		System.out.print("Gib eine Zahl > 0 und < als 50 ein, die von" + defaultNumber + "abgezonen wird: ");
		Scanner scan = new Scanner(System.in);
		int userNumber = scan.nextInt();
		
		if (userNumber < 0 ) {
			System.out.println("Die Zahl ist zu klein!");
		} else if (userNumber > 50) {
			System.out.println("Die Zahl ist zu groß!");
		} else {
			System.out.println("Perfekt!");
			int result = defaultNumber - userNumber;
			System.out.printf("%d - %d = %d", defaultNumber, userNumber, result);
		}
		
		
		
		
		
	}
	
	
}
