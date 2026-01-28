package faceTheDragon;

public class GreedyDragon extends AbstractDragon {
	
	public GreedyDragon() {
		super("Rudi", 20, 85);
	}
	
	@Override
	public void reactToCompliment() {
		changeTrust(2);
		changeAletness(-1);
	}
	
	@Override
	public void reactToFeed() {
		int randomnum = (int) (Math.random() * 2);
		if (randomnum == 1) {
			changeAletness(-2);
			changeTrust(5);
			System.out.println(randomnum);
		} else if (randomnum == 0) {
			changeAletness(3);
			changeTrust(-4);
			System.out.println(randomnum);
		}	
	}
	
	@Override
	public void reactToSing() {
			changeAletness(-3);
			changeTrust(1);
	}
	
	@Override
	public void reactToPresent(Player player) {
		if (player.getGold() >= 10) {
			player.setGold(10);
			changeAletness(-6);
			changeTrust(14);
			
		} else {
			System.out.println("Nicht genug Gold");
			changeAletness(2);
			changeTrust(-6);
		}
	}
	
	@Override
	public void reactToAproach() {
		changeAletness(-2);
		changeTrust(-2);
	}
	
	public void spell() {
		System.out.println("Der GreedyDragon startet seinen Angriff!");
		int randnum = (int) (Math.random() * 2);
		if (randnum == 1) {
			System.out.println("Angriff gelungen");
		} else if (randnum == 0) {
			System.out.println("Angriff misslungen");
		}
	}
	
	@Override
	public void winGold() {
		
	}
	
	@Override
	public void winRide() {
		
	}

}
