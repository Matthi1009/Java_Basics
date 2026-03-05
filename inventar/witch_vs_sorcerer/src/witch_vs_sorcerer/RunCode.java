package witch_vs_sorcerer;

import java.util.Scanner;

public class RunCode {
	public static void main(String[] args) {
		//Scanner return der Methode wird in String gespeichert und der andere mit String array gespeichert
	    Scanner scan = new Scanner(System.in);
	    String choice = charChoice(scan);
	    String[] names = name(scan);
	    
	    //Objektvariable nur deklariert null = noch keinem objekt zugewiesen
	    Spellcaster player = null;
	    Spellcaster computer = null;
	    
	    //Hexe oder Zauberer Abfrage
	    if (choice.equals("h")) {
	        player = new Spellcaster(names[0], "Hexe");
	        computer = new Spellcaster(names[1], "Zauberer");
	    } else if (choice.equals("z")) {
	        player = new Spellcaster(names[0], "Zauberer");
	        computer = new Spellcaster(names[1], "Hexe");
	    } else {
	        System.out.println("Ungültige Eingabe! Du musst 'h' oder 'z' wählen.");
	        System.exit(0);
	    }
	    
	    //Aufruf der Runden Methode und Scanner close
	    round(scan, player, computer);
	    scan.close();
	}

    public static String charChoice(Scanner scan) {
    	//Userinput
        System.out.print("Möchtest du Hexe(h) sein oder Zauberer(z): ");
        String choice = scan.next();
        scan.nextLine(); 
        return choice;
    }

    public static String[] name(Scanner scan) {
    	//Userinput name und random namen wahl für computer
        System.out.print("Wähle einen Namen: ");
        String username = scan.nextLine();

        String[] bot_name = {"Mereth", "Caldrin", "Eldarion", "Faenor", "Sylric"};
        int num = (int) (Math.random() * (4 - 0 + 1)) + 0;
        String bot = bot_name[num];

        String[] names = {username, bot};
        return names;
    }
    
    
    public static void compLogic(Spellcaster player, Spellcaster computer) {
    	//Computer logic random angriff oder heilen
    	int compChoice = (int) (Math.random() * 2) + 1;
        if (compChoice == 1) {
            computer.heal();
        } else {
            computer.attack(player);
        }
        computer.animal();
    }
    
    public static void win(Spellcaster player, Spellcaster computer) {
    	//Falls jemand gewinnt
    	System.out.println("\n--- Spielende ---");
    	
	    if (player.getEnergy() <= 0) {
	        System.out.println(computer.getName() + " hat gewonnen!");
	    } else if (computer.getEnergy() <= 0) {
	        System.out.println(player.getName() + " hat gewonnen!");
	    } else if (player.getEnergy() > computer.getEnergy()) {
	        System.out.println(player.getName() + " hat mehr Energie!");
	    } else if (computer.getEnergy() > player.getEnergy()) {
	        System.out.println(computer.getName() + " hat mehr Energie!");
	    } else {
	        System.out.println("Unentschieden!");
	    }
    }
    
    
    public static void round(Scanner scan, Spellcaster player, Spellcaster computer) {
    	//10 Runden
    	 for (int i = 1; i <= 10; i++) {
    		 //Anfang alles anzeigen
    	        System.out.printf("\nRunde %d\n \n", i);
    	        System.out.printf("%s (%s): %d Energie | %s (%s): %d Energie\n",
    	                player.getName(), player.getTyp(), player.getEnergy(),
    	                computer.getName(), computer.getTyp(), computer.getEnergy());
    	        
    	        //Zauber Wählen
    	        System.out.print("Wähle deinen Zauber (1 = Heilung, 2 = Angriff): ");
    	        int spellChoice = scan.nextInt();
    	        
    	        if (spellChoice == 1) {
    	            player.heal();
    	        } else {
    	            player.attack(computer);
    	        }
    	        player.animal();
    	       
    	        compLogic(player, computer);
    	        
    	        // Abbruchbedingungen
    	        if (player.getEnergy() <= 0 || computer.getEnergy() <= 0) break;
    	        if (player.getEnergy() >= 100 || computer.getEnergy() >= 100) break;
    	    }
    	 	//Gewinnmethode
    	 	win(player, computer);
    	}
}
