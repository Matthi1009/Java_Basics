package faceTheDragon;

public class ProudDragon extends AbstractDragon {
	
	public ProudDragon() {
		super("Fritz", 45, 60);
	}
	
	@Override
	public void reactToCompliment() {
		changeTrust(14);
		changeAletness(-2);
	}
	
	@Override
	public void reactToFeed() {
		int randomnum = (int) (Math.random() * 2);
		if (randomnum == 1) {
			changeAletness(-3);
			changeTrust(7);
			System.out.println(randomnum);
		} else if (randomnum == 0) {
			changeAletness(1);
			changeTrust(-2);
			System.out.println(randomnum);
		}	
	}
	
	@Override
	public void reactToSing() {
			changeAletness(-4);
			changeTrust(6);
	}
	
	@Override
	public void reactToPresent(Player player) {
		if (player.getGold() >= 10) {
			player.setGold(10);
			changeAletness(-2);
			changeTrust(4);
			
		} else {
			System.out.println("Nicht genug Gold");
			changeAletness(1);
			changeTrust(-1);
		}
	}
	
	@Override
	public void reactToAproach() {
		changeAletness(-2);
		changeTrust(4);
	}
	
	public void spell() {
		System.out.println("Der ProudDragon startet seinen Angriff!");
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
