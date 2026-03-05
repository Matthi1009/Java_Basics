package faceTheDragon;

public class GreedyDragon extends AbstractDragon {
	
	public GreedyDragon() {
		super("Rudi", 20, 85);
	}
	
	@Override
	public void reactToCompliment() {
		System.out.println("Du machst dem Drachen ein Kompliment.");
		changeTrust(2);
		changeAletness(-1);
	}
	
	@Override
	public void reactToFeed(Player player) {
		System.out.println("Du fütterst den Drachen.");
		if (player.getFood() > 0) {
		int randomnum = (int) (Math.random() * 2);
		if (randomnum == 1) {
			System.out.println("Gelungen");
			changeAletness(-2);
			changeTrust(5);
			player.setCourage(5);
			System.out.println(randomnum);
		} else if (randomnum == 0) {
			System.out.println("Misslungen");
			changeAletness(3);
			changeTrust(-4);
			player.setCourage(-15);
			System.out.println(randomnum);
		}	
		} else {
			System.out.println("Nicht genug Essen");
		}
	}
	
	@Override
	public void reactToSing() {
			System.out.println("Du singst dem Drachen etwas vor.");
			changeAletness(-3);
			changeTrust(1);
	}
	
	@Override
	public void reactToPresent(Player player) {
		if (player.getGold() >= 10) {
			System.out.println("Du beschenkst den Drachen.");
			player.setGold(10);
			changeAletness(-6);
			changeTrust(14);
			player.setCourage(5);
			
		} else {
			System.out.println("Nicht genug Gold");
			changeAletness(2);
			changeTrust(-6);
			player.setCourage(-10);
		}
	}
	
	@Override
	public void reactToAproach(Player player) {
		if (player.getCourage() <= 50) {
			System.out.println("Es hat nicht funktioniert");
		} else {
		System.out.println("Du versuchst dich dem Drachen zu nähern.");
		changeAletness(-2);
		changeTrust(-2);
		}
	}
	
	public int spell(Player player) {
		System.out.println("Der GreedyDragon startet seinen Angriff!");
		System.out.println("Er spuckt Gift auf dich.");
		int randnum = (int) (Math.random() * 2);
		if (randnum == 1) {
			System.out.println("Angriff gelungen");
			player.setCourage(-30);
			return 0;
		} else if (randnum == 0) {
			System.out.println("Angriff misslungen");
			player.setCourage(5);
			return 0;
		} else {
			return 0;
		}
	}
	

}
