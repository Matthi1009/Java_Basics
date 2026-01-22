package casino;

public class SlotMachine implements PLayable{
	
	//Methode aus Playable mit der eine Runde gespielt wird
	@Override
	public int playRound(PLayer player, Croupier croupier, int bet) {
		System.out.println("Wilkommen bei der Slotmaschine");
		//Prüft mit validCredits ob der Spieler genug hat
		if (croupier.validCredits(player.getCredits(), bet, player) == true) {
			//Runde wird gespielt
			int randomNum = (int) (Math.random() * 4) + 1;
			int randomNum2 = (int) (Math.random() * 4) + 1;
			System.out.println("Zahlen: " + randomNum + " " + randomNum2);
			player.setCredits(player.getCredits() + bet * 5);
			if (randomNum == randomNum2) {
				return 0;
			} else {
				return 1;
			}
			
		} else {
			return 2;
		}
	}
	
	//Methode aus Playable die eine winMessage ausgibt
	@Override
	public void winMessage(PLayer player) {
		System.out.println("Du hast Gewonnen!");
	}
	
	//Methode aus Playable die eine loseMessage ausgibt
	 @Override
	 public void loseMessage(PLayer player) {
		 System.out.println("Leider verloren!");
	 
	 	
}
}