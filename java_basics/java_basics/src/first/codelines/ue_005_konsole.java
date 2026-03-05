package first.codelines;
import java.util.Scanner;

public class ue_005_konsole {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Magst du Pizza? ");
		boolean name = scan.nextBoolean();
		System.out.printf("%s %n", name);
		
		//print gibt es aus ohne zeilenumbruch
		//println gibt es aus mit zeilenumbruch
		//printf gibt es aus und mann kann sachen einfügen %s %d %f %n
		
		System.out.print("Gib deinen Vornamen ein ");
		String vorname = scan.next();
		System.out.println(vorname);
		System.out.print("Gib deinen Nachnamen ein ");
		Scanner san = new Scanner(System.in);
		String nachname = san.nextLine();
		System.out.println(nachname);
		//Bei nextline muss ich einen neuen scanner machen
		
		
		Scanner can = new Scanner(System.in);
		System.out.print("Name: ");
		String namen = can.next();
		System.out.print("Art: ");
		String artString = can.next();
		System.out.print("Alter: ");
		int age = can.nextInt();
		System.out.print("Größe: %n");
		int size = can.nextInt();
		
		
		//Output mit allen drei Print varianten
		System.out.printf("Name: %s Art: %s Alter: %d Größe: %dm ", namen, artString, age, size);
		System.out.println("Name: " + namen + " Art: " + artString + " Alter: " + age + " Größe: " + size);
		System.out.print("Name: " + namen + " Art: " + artString + " Alter: " + age + " Größe: " + size);
		

		
		
		
		
		
		
		
		
		
		
	}

}
