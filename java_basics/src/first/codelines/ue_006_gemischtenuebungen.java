package first.codelines;

public class ue_006_gemischtenuebungen {
	public static void main(String[] argStrings ) {
		 //zwei variablen int und byte
        byte b = 10;
        int i = 5;
        
        //variblen zusammenrechnen und asugeben
        byte summe = (byte) (b + i);
        System.out.println("a) Ergebnis (byte): " + summe);
        //Bei arithmetischen Operationen mit byte wird auf int erweitert. Daher braucht man einen cast

        //zwei variablen und qoutient ausrechnen und den rest und ausgeben
        int x = 17;
        int y = 5;
        int quotient = x / y;
        int rest = x % y;
        System.out.println("\nb) Ganzzahliger Quotient: " + quotient);
        System.out.println("   Rest: " + rest);

        //Variable und die zusammen mit String ausgeben
        int zahl = 42;
        String text = "Antwort";
        System.out.println("\nc) " + text + ": " + zahl);

        //zwei variablen
        int a = 12;
        int b2 = 8;

        //Variablen werden verglichen und als boolean gespeichert
        boolean bed1 = (a > b2) && (a % 2 == 0);
        boolean bed2 = (a < b2) || (b2 % 2 != 0);
        boolean bed3 = (a != b2);

        
        
        //Ausgabe der Ergebnisse
        System.out.println("\nd) Ist a größer als b und a gerade? " + bed1);
        System.out.println("   Ist a kleiner als b oder b ungerade? " + bed2);
        System.out.println("   Ist a nicht gleich b? " + bed3);
    

		
		
	}

}
