package first.codelines;



public class ue_001_datatypes {
	public static void main(String[] args) {
		
		byte numberByte;
		short numberShort;
		int numberInt;
		long numberLong;
		float numberFloat;
		double numberDouble;
		char numberChar;
		boolean valueBoolean;
		
		numberLong = 7234976587966L;
// Bei einem größeren Wert muss er explizit ausgewiesen werden, mit einem L am ende.
		
		numberFloat = 10.987889f;
		
// Ohne dem f währe es ein Float mit 64 bit mit dem nur 32 bit
		
		
		numberByte = (byte) 912;
		System.out.println(numberByte);
				
//	Die Zahl wird abgeschnitten weil es die Zahl nicht in in einem byte speichern kann
		
		char chare = 'Z';
		int chari = chare;
		System.out.println(chari);
		// jetzt wir der char zu Ascii und danach wird ascii zu integer
		
		
		

	}

}
