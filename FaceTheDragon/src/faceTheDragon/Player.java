package faceTheDragon;

public class Player {
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
}

