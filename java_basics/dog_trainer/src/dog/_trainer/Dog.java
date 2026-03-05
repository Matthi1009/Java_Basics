package dog._trainer;

public class Dog {

	//fields Erstellen
    private String name;
    private int age;
    private int energy;
    private String[] tricks;
    private int trickIndex = 0;
    private int actions = 0;
    
    
   //Construktor
    public Dog(String name, int age, int trickCount) {
        this.name = name;
        this.age = age;
        this.energy = 100;
        this.tricks = new String[trickCount];
        
   //Die standard tricks lernen
        learnTrick("bellen");
        learnTrick("spielen");
    }

    
   //Getter
    public String getName() { 
    	return name; 
    }
    public int getAge() { 
    	return age; 
    }
    public int getEnergy() { 
    	return energy; 
    }

    // ===========================================================
    //Actionen für den Geburtstag
    private void action() {
        actions++;
        if (actions == 12) {
            age++;
            actions = 0;
            System.out.println(name + " hat Geburtstag! Er ist jetzt " + age + " Jahre alt!");
        }
    }

    // ===========================================================
    //Rasten methode 
    public void rest() {
        energy = 100;
        System.out.println("Der Hund ruht sich aus. Energie voll!");
        action();
    }
    
    //methode zum bellen
    public void bark() {
        if (energy < 5) {
            System.out.println("Nicht genug Energie zum Bellen!");
            return;
        }
        energy -= 5;
        System.out.println(name + " bellt! Energie: " + energy);
        action();
    }
    
    //methode fürs spielen
    public void play() {
        if (energy < 25) {
            System.out.println("Nicht genug Energie zum Spielen!");
            return;
        }
        energy -= 25;
        System.out.println("Du spielst mit " + name + ". Energie: " + energy);
        action();
    }

    // ===========================================================
    //neuen Trick lernen
    public void learnTrick(String trick) {
        if (trickIndex >= tricks.length) {
            System.out.println("Keine weiteren Tricks möglich!");
            return;
        }

        tricks[trickIndex++] = trick;
        System.out.println(name + " hat den Trick \"" + trick + "\" gelernt!");
        action();
    }

    // ===========================================================
    //Prüfen ob der Hund den Trick kennt
    public boolean canDoTrick(String trick) {
        for (String t : tricks) {
            if (t != null && t.equalsIgnoreCase(trick)) {
                return true;
            }
        }
        return false;
    }
    
    //Wenn er den Trick kennt den Trick ausführen
    public void doTrick(String trick) {
        if (!canDoTrick(trick)) {
            System.out.println("Diesen Trick kann der Hund nicht!");
            return;
        }
        if (energy < 20) {
            System.out.println("Nicht genug Energie!");
            return;
        }

        energy -= 20;
        System.out.println(name + " führt den Trick \"" + trick + "\" aus!");
        action();
    }

    // ===========================================================
    //Alle tricks anzeigen
    public void showTricks() {
        System.out.println("Tricks von " + name + ":");
        for (String trick : tricks) {
            if (trick != null) System.out.println(" - " + trick);
        }
    }
}
