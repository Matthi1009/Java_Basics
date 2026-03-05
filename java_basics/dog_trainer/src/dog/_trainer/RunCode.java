package dog._trainer;

import java.util.Scanner;

public class RunCode {

    public static void main(String[] args) {
    	//neuen scanner erstellen
        Scanner scan = new Scanner(System.in);
        
        //Abfrage wie viele Hunde
        System.out.print("Wie viele Hunde willst du haben: ");
        int dogcount = scan.nextInt();
        scan.nextLine();
        
        //Neuer array für alle Hunde
        Dog[] dogs = new Dog[dogcount];
        createDog(scan, dogs, dogcount);
        chooseDog(scan, dogs);
        scan.close();

    }
    public static void createDog(Scanner scan, Dog[] dogs, int dogcount) {
        // ===================== Hunde erstellen =====================
        //schleife damit man die anzahl der hunde erstllen kann die der User ausgewählt hat
        for (int i = 0; i < dogcount; i++) {
        	//den hund erstellen
            System.out.println("Erstelle Hund " + (i + 1) + ":");
            String name = nameDog(scan);
            int age = ageDog(scan);
            int trickCount = trickCount(scan);
            
            //Den erstellten hund zum array hinzufügen
            dogs[i] = new Dog(name, age, trickCount);
            System.out.println("Hund " + name + " wurde erstellt!");
        }

    }
   public static void chooseDog(Scanner scan, Dog[] dogs) {
        // ===================== Hund auswählen =====================
        //Game loop
        while (true) {
            System.out.println("\n--- Hundeauswahl ---");
            //alle hunde auflisten
            for (int i = 0; i < dogs.length; i++) {
                System.out.println((i + 1) + ") " + dogs[i].getName() + " (Alter: " + dogs[i].getAge() + ")");
            }
            //den hund wählen
            System.out.print("Wähle einen Hund: ");
            int choice = scan.nextInt();
            scan.nextLine();

            //überprüfen ob man einen gültigen hund gewählt hat
            if (choice < 1 || choice > dogs.length) {
                System.out.println("Ungültige Auswahl!");
                continue;
            }
            
            //das menü aufrufen für den gewählten hund
            Dog dog = dogs[choice - 1];
            dogMenu(scan, dog);
        }
   }

    // ===================== Hundemenü ===============================

    public static void dogMenu(Scanner scan, Dog dog) {
    	//Game Loop
        while (true) {
        	//hauptmenü
            int choice = mainScreen(scan, dog);
            
            //switch case mit allen actionen
            switch (choice) {
            case 1:
            	//Rasten
                dog.rest();
                break;

            case 2:
            	//Neuen Trick lernen
                dog.learnTrick(newTrick(scan));
                break;

            case 3:
            	//trick ausführen
                trickChoice(scan, dog);
                break;

            case 4:
            	//alle tricks zeigen
                dog.showTricks();
                break;

            case 5:
            	//schleife beendet
                return;

            default:
            	//ungültige eingabe
                System.out.println("Ungültige Eingabe!");
            }
        }
    }

    // ===================== Trickauswahl ============================

    public static void trickChoice(Scanner scan, Dog dog) {
    	//Frage welchen trick er machen soll
        System.out.print("Welchen Trick soll der Hund ausführen? ");
        String trick = scan.nextLine();
        
        //ausfürhen der 2 standard tricks
        if (trick.equalsIgnoreCase("bellen")) {
            dog.bark();
            return;
        }
        if (trick.equalsIgnoreCase("spielen")) {
            dog.play();
            return;
        }
        //die vom user erstellten tricks ausfürhen
        dog.doTrick(trick);
    }

    // ===================== Eingabe Methoden ===========================

    public static String nameDog(Scanner scan) {
    	//Den Namen des Hundes eingeben
        System.out.print("Name des Hundes: ");
        return scan.nextLine();
    }

    public static int ageDog(Scanner scan) {
    	//Alter des Hunden eingeben
        System.out.print("Alter des Hundes: ");
        int age = scan.nextInt();
        scan.nextLine();
        return age;
    }

    public static int trickCount(Scanner scan) {
    	//Eingabe wie viele Tricks er können soll
        System.out.print("Wie viele Tricks soll der Hund maximal lernen: ");
        int count = scan.nextInt();
        scan.nextLine();
        return count;
    }

    public static String newTrick(Scanner scan) {
    	//neuen Trick lernen
        System.out.print("Neuer Trick: ");
        return scan.nextLine();
    }

    public static int mainScreen(Scanner scan, Dog dog) {
    	//Hauptmenü für alle funktionen zum ausführen
        System.out.println(
                "+-----------------------+\n" +
                "|   Hund: " + dog.getName() + "\n" +
                "|   Energie: " + dog.getEnergy() + "\n" +
                "+-----------------------+"
        );

        System.out.println("1) Rasten");
        System.out.println("2) Neuen Trick lernen");
        System.out.println("3) Trick ausführen");
        System.out.println("4) Tricks anzeigen");
        System.out.println("5) Anderen Hund wählen");
        System.out.print("Eingabe: ");

        int choice = scan.nextInt();
        scan.nextLine();
        return choice;
    }

}
