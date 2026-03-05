package Mediathek;
import java.util.Scanner;

public class MediathekRun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] sumMinutes = new int[10];	
		DigitalMedia[] digitalMedia = {
			    new Movie("Inception", "Science-Fiction", 148, "Ein Meisterdieb dringt in Träume ein, um Geheimnisse zu stehlen."),
			    new Movie("The Dark Knight", "Action", 152, "Batman stellt sich dem Joker in Gotham City."),
			    new Movie("Interstellar", "Science-Fiction", 169, "Astronauten reisen durch ein Wurmloch, um die Menschheit zu retten."),
			    new Game("The Witcher 3", "Rollenspiel", 50, "PlayStation 5"),
			    new Game("Minecraft", "Sandbox", 30, "PC")};	
		Newsletter[] newsletters = {
			    new Newsletter(
			        "Künstliche Intelligenz entwickelt sich rasant weiter und verändert viele Berufe grundlegend. "
			        + "Unternehmen investieren verstärkt in Automatisierung und digitale Prozesse. "
			        + "Experten empfehlen, sich frühzeitig mit neuen Technologien vertraut zu machen.", 1, "Technik Spezial – KI im Alltag"
			    ), new Newsletter(
			        "Dieses Jahr erscheinen zahlreiche spannende Spiele für alle Plattformen. "
			        + "Besonders Open-World-Titel erfreuen sich großer Beliebtheit bei Spielern. "
			        + "Kritiker loben vor allem innovative Storytelling-Elemente und realistische Grafiken.", 2, "Gaming Weekly – Trends 2026"
			    ), new Newsletter(
			        "Die Filmindustrie überrascht mit kreativen Fortsetzungen und neuen Ideen. "
			        + "Streaming-Dienste konkurrieren stark mit klassischen Kinos. "
			        + "Blockbuster und Indie-Filme bieten dieses Jahr eine große Vielfalt für Filmfans.", 3, "Film Insider – Kino Highlights")};
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		choose(scan, digitalMedia, newsletters);
		int user = mediaChoice(scan);
		mediaLogic(user, digitalMedia, newsletters, mediaMenü(scan), sumMinutes, scan);
		
	}
	
	public static void getSumPlayMinutes(int[] sumMinutes) {
		int sum = 0;
		for (int i = 0; i < sumMinutes.length; i++) {
			sum += sumMinutes[i];
		}
		System.out.println(sum);
	}
	
	public static void getMaxMinutes(int[] sumMinutes) {
		int bigger = 0;
		for (int i = 1; i < sumMinutes.length; i++) {
			if (sumMinutes[i] > sumMinutes[i - 1] & sumMinutes[i] > bigger) {
				bigger = sumMinutes[i];
			} else {
				bigger = sumMinutes[i - 1];
			}
		}
		System.out.printf("Maxminutes: %d", bigger);
	}
	
	public static int choose(Scanner scan, DigitalMedia[] digitalMedia, Newsletter[] newsletters) {
		System.out.print("Digitale Medien(1) oder Newsletter(2): ");
		int user3 = scan.nextInt();
		if (user3 == 1) {
			for (DigitalMedia d : digitalMedia) {
				d.getInfo();
			}
		} else if (user3 == 2) {
			for (Newsletter n : newsletters) {
				System.out.println(n.getTitle() + " | " +n.getNumber());
			}
		}
		return user3;
	}
	
	public static int mediaChoice(Scanner scan) {
		System.out.println("\n\nWelches Medium wohlen Sie wählen: ");
		int userchoice = 0;
		try {
			userchoice = scan.nextInt();
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName());
			System.out.println("Bitte eine Zahl eingeben");
		}
		return userchoice;
		
	}
	
	public static void mediaLogic(int num, DigitalMedia[] digitalMedias, Newsletter[] newsletters, int user, int[] summinutes, Scanner scan) {
		if (num < digitalMedias.length || (num < digitalMedias.length & num < newsletters.length)) {
				mainMenüLogic(user, scan, summinutes);	
		} else {
			System.out.println("Ungültig");
		}
	}
	 
	public static int mediaMenü(Scanner scan) {
		System.out.printf(
			    "===== Media Menü 1=====\n" +
			    "1 - Medien anzeigen\n" +
			    "2 - Gesamte Spiel-/Filmlänge anzeigen\n" +
			    "3 - Längstes Medium anzeigen\n" +
			    "4 - Beenden\n" +
			    "Bitte wählen Sie eine Option: "
			);
		int user = scan.nextInt();
		return user;
	}
	
	public static int digitalMediaMenü(Scanner scan) {
		System.out.println(
			    "=== DIGITALE MEDIEN ===\n" +
			    "1 - Bewertung hinzufügen\n" +
			    "2 - Durchschnittliche Bewertung anzeigen\n" +
			    "4 - Anzahl der Bewertungen anzeigen\n" +
			    "5 - Medium abspielen\n" +
			    "6 - Film suchen nach Stichwort nur bei Film\n" +
			    "=== NEWSLETTER ========\n" +
			    "7 - News lesen\n" +
			    "8 - Newsletter suchen nach Stichwort\n" +
			    "Bitte wählen Sie eine Option: "
			);
		int user2 = scan.nextInt();
		return user2;
	}
	
	public static void mainMenüLogic(int user, Scanner scan, int[] summinutes) {
		switch (user) {
		case 1: {
			digitalMediaMenü(scan);
			break;
		} case 2: {
			getSumPlayMinutes(summinutes);
			break;
		} case 3: {
			getMaxMinutes(summinutes);
			break;
		} case 4: {
			System.out.println("Tschüss");
			break;
		}
		default:
			throw new IllegalArgumentException("Kein gültiger Wert!");
		
		}	
	}
	
	public static void digitalMediaMenüLogic(int user, Scanner scan, int[] summinutes, DigitalMedia[] digitalMedia, int index) {
		switch (user) {
		case 1: {
			digitalMedia[index].addRating(scan);
		}
		default:
			throw new IllegalArgumentException("Kein gültiger Wert!");
		}
	}
	
	
}
