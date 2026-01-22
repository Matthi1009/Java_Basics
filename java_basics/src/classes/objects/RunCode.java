package classes.objects;

public class RunCode {
	public static void main(String[] args) {
		Moped puch = new Moped("Puch Maxi S", "rot" , "2-Takt 1:50");
		Moped ktm = new Moped("KTM SX 50", "orange", "4-Takt Benzin");
		System.out.println(puch.getModel());
		System.out.println(puch.getColor());
		System.out.println(puch.getEngine());
		System.out.println(puch.getStartSpeed());	
		System.out.println(ktm.getStartSpeed());
		puch.setColor("pink");
    	System.out.println(puch.getColor());
	}
}
