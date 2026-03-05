package first.codelines;


public class ue_008_memory_comparision {
	public static void main(String[] args) {
		//4 neue Strings zum vegleiche 2 literal und 2 Objekte
		String str1 = "test";
		String str3 = "test";
		String str2 = new String("test");
		String str4 = new String("test");
		
		//Methoden werden aufgerufen
		strComparisonEquals(str1, str2, str3, str4);
		strComparisonEven(str1, str2, str3, str4);
		
		
		
		
	}
	//Neue Methode mit drei Vergleichen Literal Oject, Object Object, Literal Literal
	public static void strComparisonEquals(String str1, String str2, String str3, String str4) {
		System.out.println("Vergleich mit equals (Wert wird verglichen)");
		System.out.println("Sind die Strings gleich: " + str1.equals(str2));
		System.out.println("Vergleich mit equals (Ort wird verglichen) von zwei Literals");
		System.out.println("Sind die Strings gleich: " + str1.equals(str3));
		System.out.println("Vergleich mit equals (Wert wird verglichen) von zwei Objekten");
		System.out.println("Sind die Strings gleich: " + str2.equals(str4));
		
	}
	//Neue Methode mit drei Vergleichen Literal Oject, Object Object, Literal Literal
	public static void strComparisonEven(String str1, String str2, String str3, String str4) {
		System.out.println("Vergleich mit == (Ort wird verglichen)");
		System.out.println("Sind die Strings gleich: " + (str1 == str2));
		System.out.println("Vergleich mit == (Ort wird verglichen) von zwei Literals");
		System.out.println("Sind die Strings gleich: " + (str1 == str3));
		System.out.println("Vergleich mit equals (Wert wird verglichen) von zwei Objekten");
		System.out.println("Sind die Strings gleich: " + (str2 == str4));
	
	}
}
