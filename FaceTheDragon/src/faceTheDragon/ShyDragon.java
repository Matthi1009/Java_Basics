package faceTheDragon;

public class ShyDragon extends AbstractDragon {
	
	public ShyDragon() {
		super("Hansi", 30, 70);
	}
	
	@Override
	public void reactToCompliment() {
		changeTrust(5);
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
			changeAletness(2);
			changeTrust(-2);
			System.out.println(randomnum);
		}	
	}
	
	@Override
	public void reactToSing() {
			changeAletness(-5);
			changeTrust(6);
	}
	
	@Override
	public void reactToPresent(Player player) {
		if (player.getGold() >= 10) {
			
		}
	}
	
	@Override
	public void reactToAproach() {
		
	}
	
	public void fire() {
		
	}
}
