package atm;

import java.util.Scanner;


public class UI {
	//Static scanner
	static Scanner scan = new Scanner(System.in);
	
	//Main
	public static void main(String[] args) {
		//Objekte Erstellen
		BankAccount account = new BankAccount("Pichler Matthias", 4623, 1000);
		Saboteur sabo = new Saboteur();
		//Objekt Array erstellen
		ATM[] atms = {
			new ATM(10092, "Gaal",          sabo, account),
			new ATM(10093, "Wien Mitte",    sabo, account),
			new ATM(10094, "Stephansplatz", sabo, account),
			new ATM(10095, "Praterstern",   sabo, account),
			new ATM(10096, "Schwedenplatz", sabo, account),
			new ATM(10097, "Knittelfeld",   sabo, account),
			new ATM(10098, "Stanz",         sabo, account),
			new ATM(10099, "Floridsdorf",   sabo, account),
			new ATM(10100, "Spielberg",     sabo, account),
			new ATM(10101, "Meidling",      sabo, account)
		};

		
		boolean checker = true;
		while (checker) {
			try {
				//Alle Atm printen das Mainlogic aufrufen
				printAtms(atms);
				checker = mainLogic(atms, sabo, account);
			} catch (IsValidPinExeption e) {
				System.out.println("Fehler: " + e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println("Fehler: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Ungültige Eingabe – bitte eine Zahl eingeben.");
				scan.nextLine();
			}
		}
		scan.close();
	}

	//Mainlogic
	public static boolean mainLogic(ATM[] atms, Saboteur sabo, BankAccount account) throws IsValidPinExeption {
		//Überprüft ob überhaupt noch Atm in Betrieb sind
		if (!anyAtmAvailable(atms)) {
			System.out.println("Alle Bankomaten sind außer Betrieb. Programm wird beendet.");
			return false;
		}
		//Wen der User 10 wählt beendet sich das Programm
		int atmChoice = atmChoice();
		if (atmChoice == 10) {
			System.out.println("Auf Wiedersehen!");
			return false;
		}
		//Überprüft ob der gewählte Atm in Betrieb ist
		ATM atm = atms[atmChoice];
		sabo.sabotage(atms);
		if (!atm.getStatus()) {
			System.out.println("\nDer Bankomat, den Sie verwenden möchten, ist wegen Sprengung außer Betrieb. Suchen Sie nach einer Alternative.");
			printWorkingAtms(atms);
			return true;
		}
		//Prüft den Pin
		int pinInput = readPin(atm);
		if (!atm.checkPin(pinInput, account.getPIN())) {
			System.out.println("Falscher PIN");
			return true;
		}
		//Wenn Pin korrekt wird menü aufgerufen
		System.out.println("PIN korrekt! Willkommen, " + account.getName() + ".");
		boolean loggedIn = true;
		while (loggedIn) {
			int menuChoice = printTransactionMenu();
			loggedIn = transactionLogic(menuChoice, atm);
			if (loggedIn == true) {
				System.out.println("Aktionen: " + atm.getTransactionSum());
			}
		}
		return true;
	}

	//Alle Atm ausgeben
	public static void printAtms(ATM[] atms) {
		System.out.println("\n--- Verfügbare Bankomaten ---");
		for (int i = 0; i < atms.length; i++) {
			String status;
			if (atms[i].getStatus() == true) {
				status = "In Betrieb";
			} else {
				status = "Außer Betrieb";
			}
			System.out.println("[" + i + "] Nr." + atms[i].getSerialNumber()
					+ " - " + atms[i].getLocation()
					+ " (" + status + ")");
		}
		System.out.println("[10] Beenden");
	}

	//Prüft ob ein Atm in Betrieb ist
	public static boolean anyAtmAvailable(ATM[] atms) {
		for (ATM atm : atms) {
			if (atm.getStatus() == true) {
				return true;
			}
		}
		return false;
	}

	//Alle funktionierenden Ausgeben
	public static void printWorkingAtms(ATM[] atms) {
		System.out.println("\nFunktionierende Bankomaten:");
		for (ATM atm : atms) {
			if (atm.getStatus() == true) {
				System.out.println("  Nr." + atm.getSerialNumber() + " - " + atm.getLocation());
			}
		}
	}

	//User kann einen Bankautomaten auswählen
	public static int atmChoice() {
		System.out.print("\nWählen Sie einen Bankomaten (0-9): ");
		int choice = scan.nextInt();
		if ((choice < 0 || choice > 9) && choice != 10) {
			throw new IllegalArgumentException("Ungültige Auswahl! Bitte 0-9 oder 10 eingeben.");
		}
		return choice;
	}

	//User muss den Pin eingeben
	public static int readPin(ATM atm) {
		System.out.println("\nSie verwenden den Bankomat Nr." + atm.getSerialNumber()
				+ " in " + atm.getLocation());
		System.out.print("Bitte geben Sie Ihren PIN ein: ");
		return scan.nextInt();
	}

	//Gibt das Transaktionsmenü aus
	public static int printTransactionMenu() {
		System.out.println("\n--- Menü ---");
		System.out.println("[1] Kontostand prüfen");
		System.out.println("[2] Geld abheben");
		System.out.println("[3] Geld einzahlen");
		System.out.println("[4] Zurück zur ATM-Auswahl");
		System.out.print("Ihre Wahl: ");
		return scan.nextInt();
	}

	//Logic die je nach usereingabe mit switch case die richtige methode ausgibt
	public static boolean transactionLogic(int choice, ATM Atm) throws IsValidPinExeption {
		switch (choice) {
			case 1:
				System.out.println(Atm.checkSaldo());
				break;
			case 2:
				Atm.drawMoney(scan);
				System.out.println("Abhebung erfolgreich.");
				break;
			case 3:
				Atm.depositMoney(scan);
				System.out.println("Einzahlung erfolgreich.");
				break;
			case 4:
				return false;
			default:
				throw new IllegalArgumentException("Ungültige Auswahl!");
		}
		
		return true;
	}
	
}