package Mediathek;

import java.util.Scanner;

public class Movie extends DigitalMedia {
	private int minutes;
	private String description;
	
	public Movie(String name, String genre, int minutes, String description) {
		super(name, genre);
		this.minutes = minutes;
		this.description = description;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void  Search(Scanner scan) {
		System.out.print("Wonach wollen Sie suchen: ");
		String userString = scan.next();
		System.out.println(description.contains(userString));
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.printf("Minuten: %d\n"
				+ "Beschreibung: %s\n\n", minutes, description);
	}

}
