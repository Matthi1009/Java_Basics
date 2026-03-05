package calculator;

import java.util.Scanner;

public class RunCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean ckeck = true;
		System.out.println("Wilkommen beim Taschenrechner");
		
		while (ckeck) {
			try {
				double num = chooseNum(scan, 1); 
				double num2 = chooseNum(scan,2);

				BasicArithmetic basicArithmetic = new BasicArithmetic(num, num2);
				SquareRoot squareRoot = new SquareRoot(num, num2);
				Potentiate potentiate = new Potentiate(num, num2);
				Logarithm logarithm = new Logarithm(num, num2);
				Percentage percentage = new Percentage(num, num2);
				Product product = new Product(num, num2);

				ckeck = mainLogic(mainMenu(scan), scan, basicArithmetic, squareRoot, potentiate, logarithm, percentage, product);
			
			} catch (Exception e) {
				System.out.println("Fehler: " + e.getMessage());
			}
		}
		scan.close();
	}
	
	
	public static double chooseNum(Scanner scan, int i) {
		boolean check = false;
		double num = 0;
		while (!check) {
			try {
				System.out.printf("Geben Sie die %d Zahl ein: ", i);
				num = scan.nextDouble();
				check = true;
			} catch (Exception e) {
				System.out.println("Falsche Eingabe. Geben Sie eine Zahl ein! " + e.getClass().getSimpleName());
				scan.nextLine();
			}
		}
		return num;
	
	}
	
	public static int mainMenu(Scanner scan) {
		System.out.println("""
		        
		        ================================
		        ==         HAUPTMENÜ          == 
		        ================================
		        1) Grundrechenarten
		        2) Wurzel
		        3) Potenzieren
		        4) Logarithmus
		        5) Prozentrechnung
		        6) Produkt aller Zahlen
		        7) Verlassen
		        --------------------------------""");
		System.out.print("Auswahl: ");
		boolean ckeck = false;
		int user = 0;
		while (!ckeck) {
			try {
				user = scan.nextInt();
				ckeck = true;
			} catch (Exception e) {
				System.out.println("Fehler. Bitte eine Zahl eingeben!" + e.getClass().getSimpleName());
				scan.nextLine();
			
		}
	}
		return user;
	}
	
	public static int basicMenu(Scanner scan) {
		System.out.println("""
		        
		        ================================
		        ==      Grundrechenarten      ==             
		        ================================
		        1) Addition
		        2) Subtraktion
		        3) Multiplikation
		        4) Division
		        --------------------------------""");
		System.out.print("Auswahl: ");
		boolean ckeck = false;
		int user = 0;
		while (!ckeck) {
			try {
				user = scan.nextInt();
				ckeck = true;
			} catch (Exception e) {
				System.out.println("Fehler. Bitte eine Zahl eingeben!" + e.getClass().getSimpleName());
				scan.nextLine();
			
		}
	}
		return user;
	
	
	}
	
	public static void basicLogic(int user, BasicArithmetic basicArithmetic) {
		switch (user) {
			case(1):
				basicArithmetic.Adition();
				break;
			case(2):
				basicArithmetic.Subtraction();
				break;
			case(3):
				basicArithmetic.Multiplication();
				break;
			case(4):
				basicArithmetic.checkB();
				basicArithmetic.Division();
				break;
			default:
				System.out.println("Ungültig");
				break;
		}
	}
	
	public static boolean mainLogic(int user, Scanner scan, BasicArithmetic basicArithmetic, SquareRoot squareRoot, Potentiate potentiate, Logarithm logarithm, Percentage percentage, Product product) {
		switch (user) {
			case(1):
				basicLogic(basicMenu(scan), basicArithmetic);
				break;
			case(2):
				squareRoot.checkA();
				squareRoot.Calculate();
				break;
			case(3):
				potentiate.checkB();
				potentiate.Calculate();
				break;
			case(4):
				logarithm.checkA();
				logarithm.Calculate();
				break;
			case(5):
				percentage.checkB();
				percentage.Calculate();
				break;
			case(6):
				product.checkA();
				product.Calculate();
				break;
			case(7):
				System.out.println("Tschüss");
				return false;
			default:
				System.out.println("Ungültig");
				break;
						
				
		}
		return true;
	}
}
