package faceTheDragon;

public class Player implements GoldGoal, RideGoal{
	private String name;
	private int gold;
	private int food;
	private int courage;
	
	public Player(String name) {
		this.gold = 20;
		this.food = 8;
		this.courage = 60;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGold() {
		return gold;
	}
	
	public int getFood() {
		return food;
	}
	
	public int getCourage() {
		return courage;
	}
	
	public void setGold(int amount) {
		gold -= amount;
	}
	
	public void setCourage(int amount) {
		courage += amount;
	}
	
	public void decreaseFood(int amount) {
		food -= amount;
	}
	
	public void checkCourage() {
		if (courage <= 0) {
			courage = 0;
		}
	}
	
	@Override
	public int winRide(AbstractDragon[] dragon, int ran) {
		if (dragon[ran].getTrust() > 80) {
			System.out.println("Glückwunsch du hast das RideGoal erreicht, du kannst jetzt auf dem Drachen Fliegen.");
			return 1;
		} else {return 0;}
	}
	
	@Override
	public int winGold(AbstractDragon[] dragon, int ran) {
		if (dragon[ran].getAlertness() == 0) {
			System.out.println("Glückwunsch du hast das GoldGoal erreicht, der Drache ist eingeschlafen und du kannst sein Gold stehlen.");
			return 1;
		} else {return 0;} 
	}
}

