package faceTheDragon;

public abstract class AbstractDragon {
	private String name;
	private int trust;
	private int alertness;
	
	public AbstractDragon(String name, int trust, int alertness) {
		this.name = name;
		this.trust = trust;
		this.alertness = alertness;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTrust() {
		return trust;
	}
	
	public int getAlertness() {
		return alertness;
	}
	
	public int changeTrust(int amount) {
		trust += amount;
		return trust;
	}
	
	public int changeAletness(int amount) {
		alertness += amount;
		return alertness;
	}
	
	public void status() {
		System.out.printf("Status! %nVertrauen: %d %nWachsamkeit: %d \n", trust, alertness);
	}
	
	public void ckeck() {
		if (trust <= 0) {trust = 0;}
		else if (trust >= 100) {trust = 100;}
		else if (alertness <= 0) {alertness = 0;}
		else if (alertness >= 100) {alertness = 100;}
	}
	
	
	//Reaktionen
	public abstract void reactToCompliment();
	public abstract void reactToFeed(Player player);
	public abstract void reactToSing();
	public abstract void reactToPresent(Player player);
	public abstract void reactToAproach(Player player);
	public abstract int spell(Player player);
}
