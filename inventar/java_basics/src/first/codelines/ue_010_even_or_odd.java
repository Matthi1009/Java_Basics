package first.codelines;

import java.util.Scanner;

public class ue_010_even_or_odd {

    public static void main(String[] args) {
    	//Scanner plus usereingabe
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        int num = scan.nextInt();
        //Aufruf methode
        evenOrOdd(num);
    
    }
    
    public static void evenOrOdd(int num) {
    	//Überpruft ob die zahl durch 2 gleich 0 ist
        if (num % 2 == 0) {
            System.out.println("Die Zahl " + num + " ist gerade.");
        } else {
            System.out.println("Die Zahl " + num + " ist ungerade.");
        }
    }
}
