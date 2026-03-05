package casino;

import java.util.Scanner;

public class Casino {
	//Main
	public static void main(String[] args) {
		//Erstellt Arry mit den Spielen
		PLayable[] games = {new SlotMachine(), new Roulette()};
		//Scanner Croupier und Spieler werden erstellt
		Scanner scan = new Scanner(System.in);
		Croupier croupier = new Croupier("Siegfried");
		PLayer pLayer = createPlayer(scan);
		//performRole von Spieler und Croupier
		croupier.performRole();
		pLayer.performRole();
		//Variable für die schleife 1 einfach das was drinne is
		int choice = 1;
		while (choice != 5) {
			//Mainmenü und logic in einem game-Loop
			choice = printMainMenü(scan);
			mainMenüLogic(choice, pLayer, scan, games, croupier);
			
			}
		
		scan.close();
	}
	
	//Methode zum erstellen des Spielers mit Namen und Anfangscredits
	public static PLayer createPlayer(Scanner scan) {
	    System.out.print("Geben Sie Ihren Namen ein: ");
	    String user = scan.nextLine();
	    int credits;

	    while (true) {
	        System.out.print("Mit wie vielen Credits spielen Sie (Mind. 30): ");
	        try {
	            credits = scan.nextInt();
	            scan.nextLine();

	            if (credits < 30) {
	                System.out.println("Zu wenig Credits!");
	            } else {
	                return new PLayer(user, credits);
	            }
	        } catch (Exception e) {
	            System.out.println("Fehler! Bitte geben Sie eine gültige Zahl ein.");
	            System.out.println(e.getClass().getSimpleName());
	            scan.nextLine();
	        }
	    }
	}

			
	
	
	//Methode die das Mainmenü printet und die auswahl zurückgibt
	public static int printMainMenü(Scanner scan) {
		System.out.println("""
				====================
				====   Casino   ====
				====================
				|1: Credits Anzeigen
				|2: Credits erhöhen 
				|3: Roulette
				|4: SlotMaschine
				|--------------------
				|5: Exit
				---------------------
				""");
		System.out.print("Auswahl: ");
		boolean check = false;
		int user = -1;
		while (!check) {
		    try {
		        user = scan.nextInt();
		        scan.nextLine(); 
		        check = true;
		    } catch (Exception e) {
		        System.out.println("Fehler! Bitte Zahl eingeben.");
		        scan.nextLine(); 
		    }
		}

		return user;

	}
	
	//Methode zum Setzen von Credits
	public static int place(Scanner scan, PLayer pLayer, Croupier croupier) {
		System.out.println("Wie viele Credits wollen Sie setzen: ");
		boolean check = false;
		int amount = -1;
		while (!check) {
			try {
				amount = scan.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("Fehler! Bitte Zahl eingeben");
				System.out.println(e.getClass().getSimpleName());
				scan.nextLine();
			}
		}
		return amount;
		
	}
	
	//Logic fürs Mainmenü mit switch case
	public static void mainMenüLogic(int choice, PLayer pLayer, Scanner scan, PLayable[] games, Croupier croupier) {
		switch (choice) {
		//Printet die Credits
		case 1:
			System.out.printf("Ihre Credits: %d %n", pLayer.getCredits());
			break;
		//Erhöht die Credits
		case 2:
			System.out.print("Um wie viel möchten Sie ihre Credits erhöhen: ");
			int amount = scan.nextInt();
			pLayer.addCredits(amount);
			System.out.printf("Neue Credits: %d %n", pLayer.getCredits());
			break;
		//Spielt eine Runde Roulette
		case 3:
			System.out.println("Gerade(0) oder Ungerade(1): ");
			int userNum = scan.nextInt();
			int bet = place(scan, pLayer, croupier);
			if (games[1].playRound(pLayer, croupier, bet) == userNum) {
				pLayer.setCredits(pLayer.getCredits() + bet * 7);
				games[1].winMessage(pLayer);
				break;
			} else {
				games[1].loseMessage(pLayer);
			}
			break;
		//Spielt eine Runde Slots
		case 4:
			if (games[0].playRound(pLayer, croupier, place(scan, pLayer, croupier)) == 0) {
				games[0].winMessage(pLayer);
				break;
			} else {
				games[0].loseMessage(pLayer);
			}
			break;
		//Print tschüss fürs verlassen
		case 5:
			System.out.println("Tschüss");
			break;
		//Default für ungültige eingabe
		default:
			System.out.println("Ungültige eingabe");
		}
	}

}
