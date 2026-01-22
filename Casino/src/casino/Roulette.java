package casino;

public class Roulette implements PLayable {
	
	//Methode aus Playable mit der eine Runde gespielt wird
	@Override
	public int playRound(PLayer player, Croupier croupier, int bet) {
		System.out.println("Wilkommen beim Roulette");
		//Prüft mir validCredits ob der Spieler genug hat.
		if (croupier.validCredits(player.getCredits(), bet, player) == true) {
			//startet die runde
			int randomnum = (int) (Math.random() * 37);
			if (randomnum % 2 == 0) {
			return 0;	
			} else  {
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
