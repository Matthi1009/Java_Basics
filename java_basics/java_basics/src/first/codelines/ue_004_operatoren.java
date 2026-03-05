package first.codelines;

public class ue_004_operatoren {
	public static void main(String[] args) {
		//nummer deklarieren
		int num1 = 23;
		int num2 = 4;
		
		
		//Nummern rechnen
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		int num6 = num1 / num2;
		int num7 = num1 % num2;
		//ergebnisse ausgeben
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		
		//floats definieren
		float floatn = 4.4f;
		float floatn2 = 23.4f;
		
		//floats rechnen
		float floatn3 = floatn / floatn2;
		System.out.println(floatn3);
		
		//neue ints anlegen
		int a = 10;
		int b = 20;
		
		//mit operatoren ausgeben
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		
		//variable a mit += und so 
		int n1 = a += 9;
		int n2 = a -= 9;
		int n3 = a *= 9;
		int n4 = a /= 9;
		int n5 = a %= 9;
		
		//alles printen
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		//die werte bleiben nur bei - und / gleich
		
		//zwei booleans
		boolean boolnum = true;
		boolean boolnum2 = false;
		
		//logische Opearatoren einbauen
		System.out.println(boolnum & boolnum2);
		System.out.println(boolnum | boolnum2);
		System.out.println(boolnum ^ boolnum2);
		System.out.println(boolnum && boolnum2);
		System.out.println(boolnum || boolnum2);
		System.out.println(!boolnum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
