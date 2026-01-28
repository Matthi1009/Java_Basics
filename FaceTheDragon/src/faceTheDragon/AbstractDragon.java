package faceTheDragon;

public abstract class AbstractDragon implements GoldGoal, RideGoal {
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
		System.out.printf("Status! %n Vertrauen: %d %n Wachsamkeit: %d", trust, alertness);
	}
	
	
	//Reaktionen
	public abstract void reactToCompliment();
	public abstract void reactToFeed();
	public abstract void reactToSing();
	public abstract void reactToPresent(Player player);
	public abstract void reactToAproach();
	public abstract void spell();
}
