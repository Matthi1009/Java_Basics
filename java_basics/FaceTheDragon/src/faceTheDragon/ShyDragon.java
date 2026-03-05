package faceTheDragon;

public class ShyDragon extends AbstractDragon {
	
	public ShyDragon() {
		super("Hansi", 30, 70);
	}
	
	@Override
	public void reactToCompliment() {
		System.out.println("Du machst dem Drachen ein Kompliment.");
		changeTrust(5);
		changeAletness(-2);
	}
	
	@Override
	public void reactToFeed(Player player) {
		System.out.println("Du fütterst den Drachen.");
		if (player.getFood() > 0) {
		int randomnum = (int) (Math.random() * 2);
		if (randomnum == 1) {
			System.out.println("Gelungen");
			changeAletness(-3);
			changeTrust(7);
			player.setCourage(10);
			System.out.println(randomnum);
		} else if (randomnum == 0) {
			System.out.println("Misslungen");
			changeAletness(2);
			changeTrust(-2);
			System.out.println(randomnum);
			player.setCourage(-20);
		}	
		} else {
			System.out.println("Nicht genug Essen");
		}
	}
	
	@Override
	public void reactToSing() {
			System.out.println("Du singst dem Drachen etwas vor.");
			changeAletness(-5);
			changeTrust(6);
	}
	
	@Override
	public void reactToPresent(Player player) {
		System.out.println("Du beschenkst den Drachen.");
		if (player.getGold() >= 10) {
			player.setGold(10);
			changeAletness(-2);
			changeTrust(5);
			player.setCourage(5);
		} else {
			System.out.println("Nicht genug Gold");
			changeAletness(1);
			changeTrust(-3);
		}
	}
	
	@Override
	public void reactToAproach(Player player) {
		if (player.getCourage() <= 50) {
			System.out.println("Es hat nicht funktioniert nicht genug Mut.");
		} else {
		System.out.println("Du versuchst dich dem Drachen zu nähern.");
		changeAletness(-2);
		changeTrust(-2);
		}
	}
	
	public int spell(Player player) {
		System.out.println("Der ShyDragon startet seinen Angriff!");
		System.out.println("Er speit Feuer auf dich.");
		int randnum = (int) (Math.random() * 10);
		if (randnum % 2 == 0) {
			System.out.println("Angriff gelungen");
			player.setCourage(-10);
			return 0;
		} else {
			System.out.println("Angriff misslungen");
			player.setCourage(5);
			return 0;
		}
	}
}
