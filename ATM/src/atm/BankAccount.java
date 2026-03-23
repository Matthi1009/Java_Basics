package atm;

public class BankAccount {
	//Fields
	private String name;
	private int PIN;
	private double saldo;

	//Constructor
	public BankAccount(String nameCustomer, int PIN, int saldo) {
		this.name = nameCustomer;
		this.PIN = PIN;
		this.saldo = saldo;
	}

	//Getter
	public String getName() {
		return name;
	}

	public int getPIN() {
		return PIN;
	}

	public double getSaldo() {
		return saldo;
	}

	//Setter
	public void increaseSaldo(double amount) {
		saldo += amount;
	}

	public void decreaseSaldo(double amount) {
		saldo -= amount;
	}

}