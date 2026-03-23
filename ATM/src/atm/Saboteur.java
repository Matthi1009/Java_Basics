package atm;

public class Saboteur {
	//Fields
	private ATM[] saboAtms;
	private int arrcount;
	
	//Constructor
	public Saboteur() {
		this.saboAtms = new ATM[10];
	}

	//Getter
	public ATM[] getAtms() {
		return saboAtms;
	}

	public int getArrCount() {
		return arrcount;
	}

	//Alle Atms werden in den Array vom Saboteur gelegt 
	public void pushAtmToArray(ATM atm) {
		if (arrcount >= saboAtms.length) {
			System.out.println("Array voll!");
		} else {
			saboAtms[arrcount] = atm;
			arrcount++;
		}
	}

	//Random Atm der Sabotiert wird
	public void sabotage(ATM[] atms) {
		int rannum = (int)(Math.random() * 10);
		atms[rannum].setStatus(false);
	}
}