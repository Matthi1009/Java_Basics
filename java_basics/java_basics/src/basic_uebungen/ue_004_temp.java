package basic_uebungen;

import java.util.Scanner;

public class ue_004_temp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Temperatur-Umrechner (Celsius → Fahrenheit)");
        calc(scan);
        scan.close();
    }

    public static void calc(Scanner scan) {
        String choice; 
        
        do {
            float celsius = user(scan);  
            float fahrenheit = convertToFahrenheit(celsius); 
            System.out.printf("%.2f Grad Celsius sind %.2f Grad Fahrenheit.%n", celsius, fahrenheit);
            
            System.out.print("Möchten Sie eine weitere Temperatur umrechnen? (ja/exit): ");
            choice = scan.next(); 
            
        } while (!choice.equalsIgnoreCase("exit")); 
        
        System.out.println("Programm beendet.");
    }

  
    public static float user(Scanner scan) {
        System.out.print("Geben Sie eine Temperatur in Celsius ein: ");
        return scan.nextFloat();
    }

    
    public static float convertToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
