package atm;

import java.util.Scanner;

public class ATM {
	//Fields
	private BankAccount account;
	private int serialNumber;
	private String location;
	private boolean status;
	static int transactionSum = 0;

	//Constructor
	public ATM(int serialNumber, String location, Saboteur sabo, BankAccount account) {
		this.serialNumber = serialNumber;
		this.location = location;
		this.status = true;
		this.account = account;
		sabo.pushAtmToArray(this);
	}

	//Getter
	public int getSerialNumber() {
		return serialNumber;
	}

	public String getLocation() {
		return location;
	}

	public boolean getStatus() {
		return status;
	}

	public int getTransactionSum() {
		return transactionSum;
	}

	//Setter
	public void setStatus(boolean saboChoice) {
		status = saboChoice;
	}

	//Überprüft ob der Pin formal richtig ist
	public boolean isValidPin(int userpin) {
		if (userpin < 0) return false;
		if (String.valueOf(userpin).length() == 4) { return true; }
		else { return false; }
	}

	//Überprüft ob der User den Richtigen Pin eingegeben hat
	public boolean checkPin(int userPin, int atmPin) throws IsValidPinExeption {
		transactionSum += 1;
		if (!isValidPin(userPin)) {
			throw new IsValidPinExeption("Ungültiger PIN! PIN muss genau 4 Ziffern haben.");
		}
		if (userPin == atmPin) return true;
		else return false;
	}

	//Methode zum Geld abheben
	public void drawMoney(Scanner scan) throws IllegalArgumentException {
		transactionSum += 1;
		System.out.print("Wie viel wollen Sie abheben: ");
		double amount = scan.nextDouble();
		scan.nextLine();
		if (amount <= 0) {
			throw new IllegalArgumentException("Ungültiger Betrag! Muss größer als 0 sein.");
		}
		if (amount > account.getSaldo()) {
			throw new IllegalArgumentException("Nicht genug Guthaben! Saldo: " + String.format("%f€", account.getSaldo()));
		}
		account.decreaseSaldo(amount);
	}

	//Methode um Geld aufs Konto zu legen
	public void depositMoney(Scanner scan) throws IllegalArgumentException {
		System.out.print("Wie viel wollen Sie einzahlen: ");
		double amount = scan.nextDouble();
		scan.nextLine();
		if (amount <= 0) {
			throw new IllegalArgumentException("Ungültiger Betrag! Muss größer als 0 sein.");
		}
		account.increaseSaldo(amount);
		transactionSum += 1;
	}

	//Gibt das Saldo aus
	public String checkSaldo() {
		transactionSum += 1;
		return String.format("Ihr Saldo beträgt: %f€", account.getSaldo());
	}
}