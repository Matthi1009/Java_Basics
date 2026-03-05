package inventar;

public class runCode {
	public static void main(String[] args) {
		//Neues Objekt als scouvenir erstellen
		souvenir souvenir = new souvenir("Schlüsselanhänger", 99, 20);
		
		//Alle methoden ausgeben und Aufrufen
		System.out.printf("Bezeichnung: %s %n", souvenir.getLabel());
		System.out.printf("Preis: %d Cent %n", souvenir.getPriceCents());
		System.out.printf("Verfügbar: %b %n", souvenir.isAvailable());
		souvenir.sellOne(3);
		System.out.println("");
		
		//Neues Objekt als sncak erstellen
		snack snack = new snack("Schokoriegel", 148, 10);
		
		//Alle methoden ausgeben und Aufrufen
		System.out.printf("Bezeichnung: %s %n", snack.getLabel());
		System.out.printf("Preis: %d Cent %n", snack.getPriceCents());
		System.out.printf("Verfügbar: %b %n", snack.isAvailable());
		snack.sellOne(1);
	}
}
