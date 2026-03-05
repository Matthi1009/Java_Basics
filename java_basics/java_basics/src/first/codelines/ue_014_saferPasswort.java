package first.codelines;

import java.util.Scanner;

public class ue_014_saferPasswort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pw(scan);
     
    }

    public static void pw(Scanner scan) {
        boolean safe = false;

        while (!safe) {
            System.out.print("Geben Sie ein Passwort ein: ");
            String pw = scan.nextLine();
            safe = pwChecker(pw);
        }
    }

    public static boolean pwChecker(String pw) {
        boolean bigletter = false;
        boolean specialnumber = false;
        boolean smallnumber = pw.length() >= 8;

        // Liste der erlaubten Sonderzeichen
        String specialnumbers = "§%&!?";

        // Jeden Buchstaben prüfen
        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);

            if (Character.isUpperCase(c)) {
                bigletter = true;
            }

            if (specialnumbers.indexOf(c) != -1) {
                specialnumber = true;
            }
        }

        // Fehlermeldungen ausgeben
        if (!smallnumber) {
            System.out.println("Passwort ist zu kurz (mind. 8 Zeichen).");
        }
        if (!bigletter) {
            System.out.println("Passwort muss mindestens einen Großbuchstaben enthalten.");
        }
        if (!specialnumber) {
            System.out.println("Passwort muss mindestens eines der folgenden Sonderzeichen enthalten: § % & ! ?");
        }

        // Wenn alles passt
        if (smallnumber && bigletter && specialnumber) {
            System.out.println(" Passwort ist sicher!");
            return true;
        } else {
            System.out.println("Bitte versuchen Sie es erneut.\n");
            return false;
        }
    }
}
