package Mediathek;

import java.util.Scanner;

public abstract class DigitalMedia {
	
	private String name;
	private String genre;
	private int[] rating;
	private float avrRating;
	private int ratecount;
	
	public DigitalMedia(String name, String genre) {
		this.name = name;
		this.genre = genre;
		this.rating = new int[5];
		this.avrRating = getAvrRating();
		this.ratecount = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int[] getRating() {
		return rating;
	}
	
	public float getAvrRating() {
		int sum = 0;
		for (int i = 0; i > 5; i++) {
			sum += rating[i];
		}
		if (ratecount != 0) {
			avrRating = sum / ratecount;
		}
		return avrRating;
	}
	
	public int getRateCount() {
		return ratecount;
	}
	
	public void addRating(Scanner scan) {
		System.out.printf("Geben Sie ihre %d. Berwertung ab: (1-5): ", ratecount);
		int usernum = scan.nextInt();
		rating[ratecount] = usernum;
		ratecount += 1;
		
		
	}
	
	public void getInfo() {
		System.out.printf("Infos: \n"
				+ "Name: %s\n"
				+ "Genre: %s\n"
				+ "Rating: %f\n", name, genre, avrRating);
	}
}
