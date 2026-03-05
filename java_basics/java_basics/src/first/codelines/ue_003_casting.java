package first.codelines;


public class ue_003_casting {
	public static void main(String[] args) {
		
		//implizit casten
		int number = 17;
		long number2 = number;
		
		//explizit casten
		double floatn = 7.85;
		int floatn2 = (int) floatn;
		
		//print
		System.out.println(floatn);
		System.out.println(floatn2);
		
		
		//int zu byte casten
		int num = 130;
		byte num2 = (byte) num;
		System.out.println(num2);
		//beim caten wird der binärcode abschnitten da bei byte nur bis zu 127 speichern
		
		
		//char in int casten anderes ergebniss
		char chari = '9';
		int chari2 = (int) chari;
		System.out.println(chari2);
		
		long num3 = 298765467865467876L;
		float floatn3 = (float) num3;
		System.out.println(floatn3);
		//Ja aber es wird zur Gleitkomma zahl
		
		
		
		
		
		
		
		
		
		
	}

}
