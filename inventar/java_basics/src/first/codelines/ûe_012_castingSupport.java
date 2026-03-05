package first.codelines;

import java.util.Scanner;


public class ûe_012_castingSupport {
	public static void main(String[] args) {
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//inputs werden gescannt und beide methoden werden aufgerufen
		  System.out.print("Geben sie eine Zahl ein: ");
		  int number = scan.nextInt();
		  System.out.print("In welchen Datentyp wollen Sie casten: ");
		  String  user = scan.next();
		  explizit(scan, number, user);
		  inplizit(scan, number, user);
		  
		}
	
	public static void inplizit(Scanner scan, int num, String user) {
		//auf long casten
		if(user.equals("long")) {
			long num2 = num;
			System.out.println(num2);
			
		}
	}
	
	public static void explizit(Scanner scan, int num, String user) {
		//auf short casten
		if(user.equals("short")) {
			short num3 = (short) num;
			System.out.println(num3);
		}
		//auf byte casten
		if(user.equals("byte")) {
			byte num3 = (byte) num;
			System.out.println(num3);
		}
	}
	public static void exit(String user) {
		//exit methode
		if(user.equals("exit")) {
			System.out.println("Tschüss");
		}
	}
}
