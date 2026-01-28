package faceTheDragon;

import java.util.Scanner;

public class PlayGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int randnum  = (int) (Math.random() * 2);
		AbstractDragon[] dragon = {new ShyDragon(), new GreedyDragon(), new ProudDragon()};
		Player player = new Player(createPlayer(scan));

	}

	public static String createPlayer(Scanner scan) {
		System.out.print("Bennene deinen Spieler: ");
		String name = scan.nextLine();
		return name;
	}
	
	public static void chooseGoal(Scanner scan, AbstractDragon dragon) {
		System.out.println("Welche Ziel? Ride(1) Gold(2): ");
		
	}
	
	public static void round(AbstractDragon[] dragon, Player player) {
		for (int i = 0; i < 8; i++) {
		
		}
	}
}
