package first.codelines;

import java.util.Scanner;

public class ue_011_grading_Scale {
	public static void main(String[] args) {
		inputs();
	}

	public static void inputs() {
		//input und scanner und aufruf der scorecalc methode
		System.out.print("Gib deine Punktzahl ein: ");
		Scanner scan = new Scanner(System.in);
		float score = scan.nextFloat();
		scoreCalc(score);
	}

	public static void scoreCalc(float score) {
		//überprüft wie viele punkte und gibt die note aus
		if (score > 0 && score <= 50) {
			System.out.printf("Nicht genügent");
		}
		if (score > 50 && score <= 64) {
			System.out.printf("Genügent");
		}
		if (score > 64 && score <= 77) {
			System.out.printf("Befriedigent");
		}
		if (score > 77 && score <= 89) {
			System.out.printf("Gut");
		}
		if (score > 89 && score <= 100) {
			System.out.printf("Sehr gut");
		}
	}
}
