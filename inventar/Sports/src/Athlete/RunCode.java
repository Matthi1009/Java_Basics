package Athlete;

import java.util.Scanner;


public class RunCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		swimmer swimmer = new swimmer("Franzi", 36, "Rückenschwwimmen");
		runner runner = new runner("Wetzi", 24);
		basketballer basketballer = new basketballer("Fritz", 29, 1.95);
		basejumper basejumper = new basejumper("Marco", 40, 9);
		skier skier = new skier("Igor", 34, 127);
		athlete athlete = new athlete("Rudi", 42);
		
		while (true) {
		System.out.println("--------------Athlete--------------");
		System.out.println(athlete);
		athlete.practice(45);
		athlete.celebrate();	
		
		System.out.println("--------------Schwimmer--------------");
		System.out.println(swimmer);
		swimmer.practice(45);
		swimmer.celebrate();
		
		System.out.println("--------------Läufer--------------");
		System.out.println(runner);
		runner.celebrate();
		runner.compete();
		runner.practice(50);
		
		System.out.println("--------------Basketballer--------------");
		System.out.println(basketballer);
		basketballer.practice(60);
		basketballer.celebrate();
		basketballer.dunking();
		
		System.out.println("--------------Skier--------------");
		System.out.println(skier);
		skier.practice(70);
		skier.celebrate();
	    System.out.print("Gib die Geschwindigkeit ein: ");
	    int speed = scan.nextInt();
	    System.out.print("Gib die Schneequalität ein (0 = eisig, 1 = gut, 2 = weich): ");
	    int snow = scan.nextInt();
		skier.skierRun(speed, snow);
		
		System.out.println("--------------Basejumper--------------");
		System.out.println(basejumper);
		basejumper.celebrate();
		basejumper.practice(56);
		basejumper.jump();
		
		System.out.println("Weiter(1) oder Beenden(irgendwas)");
		int loop = scan.nextInt();
		if (loop == 1) {
			System.out.println("Weiter");
		} else {
			break;
		}
	}
		scan.close();
	}
	
}
