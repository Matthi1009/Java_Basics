package inventar;

public interface sellable {
	//Methoden
	public abstract String getLabel();
	public abstract int getPriceCents();
	public abstract boolean isAvailable();
	public abstract void sellOne(int soldItems);
		
	}

