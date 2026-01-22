package first.codelines;

public class ue_002_string {
	public static void main(String[] args) {
		
		//Es werden Strings erstellt 2 Literals 4 objects
		String name = "Massong";
		String name2 = "Massong";
		String name3 = new String("Julian");
		String name4 = new String("Julian");
		String name5 = new String("Julian");
		String name6 = new String("Massong");
		
		
		//es wird mit == überprüft ob der ort gleich ist und mit .equals ob der Wert gleich ist
		if (name == name2) {
			System.out.println(name);
		}
		if (name.equals(name2)) {
			System.out.println(name);
		}
		if (name3 == name4) {
			System.out.println(name);
		}	
		if (name3.equals(name4)) {
			System.out.println(name);
		}
		
		
		//Ausgabe
		System.out.println(name5 + name6);
		System.out.println(name.length());
		
		
		
		
		
		
			
		
		
	}

}
