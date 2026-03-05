package Mediathek;

import java.util.Scanner;

public class Newsletter {
	private String news;
	private int number;
	private String title;
	
	public Newsletter(String news, int number, String title) {
		this.news = news;
		this.number = number;
		this.title = title;
	}
	
	public String getNews() {
		return news;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void Search(Scanner scan) {
		System.out.print("Wonach wollen Sie suchen: ");
		String userString = scan.next();
		System.out.println(news.contains(userString));
	}
	
	public void read() {
		System.out.println(news);
	}
	
	
}
