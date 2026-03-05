package inventar;

public class souvenir implements sellable {
	//Fields
	private String label;
	private int priceCents;
	private int stock;
	
	//Constructor für alle fields
	public souvenir(String label, int priceCents, int stock) {
		this.label = label;
		this.priceCents = priceCents;
		this.stock = stock;
	}
	
	//gibt das Label zurück
	@Override
	public String getLabel() {
		return label;
	}
	
	//gibt den Preis zurück
	@Override
	public int getPriceCents() {
		return priceCents;
	}
	
	//Prüft ob noch Sachen im Inventar sind
	@Override
	public  boolean isAvailable() {
		if (stock > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//Zieht verkauften sachen vom Inventar ab
	@Override
	public void sellOne(int soldItems) {
		//If prüft ob genug Sachen da sind
		if (stock >= soldItems) {
			stock -= soldItems;
			System.out.printf("%d Souvenirs verkauft noch %d im Inventar. %n", soldItems, stock);
		} else {
			System.out.println("Nicht genug im Inventar \n");
		}
	}
	
	

}
