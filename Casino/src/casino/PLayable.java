package casino;

public interface PLayable {
	//Abstracte Klassen fürRoulette und SlotMaschine
	public abstract int playRound(PLayer player, Croupier croupier, int bet);
	public abstract void winMessage(PLayer player);
	public abstract void loseMessage(PLayer player);
	
	
}
