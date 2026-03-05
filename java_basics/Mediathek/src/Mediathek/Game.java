package Mediathek;

public class Game extends DigitalMedia {
	private int estimatedHours;
	private String console;

	public Game(String name, String genre, int estimatedHours, String console) {
		super(name, genre);
		this.estimatedHours = estimatedHours;
		this.console = console;
	}

	public int getEstimatedHours() {
		return estimatedHours;
	}

	public String getConsole() {
		return console;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.printf("Dauer des Spiels: %d\n"
				+ "Console: %s\n\n", estimatedHours, console);
	}

}
