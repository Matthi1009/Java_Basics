package faceTheDragon;
import java.util.Scanner;

public class PlayGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AbstractDragon[] dragon = {new ShyDragon(), new GreedyDragon(), new ProudDragon()};
		int randnum  = (int) (Math.random() * dragon.length);
		Player player = new Player(createPlayer(scan));
		int goal = chooseGoal(scan);
		round(dragon, player, randnum, scan, goal);
		
	}

	public static String createPlayer(Scanner scan) {
		System.out.print("Bennene deinen Spieler: ");
		String name = scan.nextLine();
		return name;
	}
	
	public static int chooseGoal(Scanner scan) {
		System.out.print("Welche Ziel? Ride(1) Gold(2): ");
		int usernumb = scan.nextInt();
		if (usernumb == 1) {
			return 1;
		} else if (usernumb == 2) {
			return 2;
		} else {
			System.out.println("Üngültig");
			return 0;
		}
	}
	
	
	public static void round(AbstractDragon[] dragon, Player player, int randnum, Scanner scan, int goal) {
		for (int i = 0; i < 8; i++) {
			if (goal == 1) {
				if (player.winRide(dragon, randnum) == 1) {
					break;
				}
			} else if (goal == 2) {
				if (player.winGold(dragon, randnum) == 1) {
					break;
				}
			}
			player.checkCourage();
			dragon[randnum].ckeck();
			System.out.printf("\nRunde: %d Verbleibende Runden: %d %n"
					+ "Mut: %d Gold: %d %n"
					+ "Essen: %d Vertrauen: %d %n"
					+ "Wachsamkeit: %d \n", i, 8-i, player.getCourage(), player.getGold(), player.getFood(), dragon[randnum].getTrust(), dragon[randnum].getAlertness());
			if (dragon[randnum].spell(player) == 2) {
				System.out.println("Du bist vereist");
			} else {
				mainLogic(mainMenü(scan), dragon, randnum, player);
			}
		
		}
		System.out.println("\n Spiel zu Ende");
	}
	
	public static int mainMenü(Scanner scan) {
		System.out.println("""
		        
		        ================================
		               🐉  HAUPTMENÜ  🐉
		        ================================
		        
		        1) Kompliment machen
		        2) Füttern (kann gelingen oder scheitern)
		        3) Beruhigend singen
		        4) Geschenk anbieten (kostet 10 Gold)
		        5) Sich vorsichtig nähern
		        6) Status anzeigen
		        --------------------------------""");
		System.out.print("Bitte wähle eine Aktion: ");
		int usernum = scan.nextInt();
		System.out.println("");
		return usernum;
	}
	
	public static void mainLogic(int usernum, AbstractDragon[] dragon, int ran, Player player) {
		switch (usernum) {
		case(1): 
			dragon[ran].reactToCompliment();
			break;
		case(2):
			dragon[ran].reactToFeed(player);
			break;
		case(3):
			dragon[ran].reactToSing();
			break;
		case(4):
			dragon[ran].reactToPresent(player);
			break;
		case(5):
			dragon[ran].reactToAproach(player);
			break;
		case(6):
			dragon[ran].status();
			break;
		default:
			System.out.println("Ungültig");
			break;		
		}
	}

}
