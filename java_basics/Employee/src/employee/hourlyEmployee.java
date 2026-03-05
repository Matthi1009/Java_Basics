package employee;


public class hourlyEmployee extends employee {
	//Fields
	private double hourlyRate;
	private int monthlyHours;
	
	//Constuctor mit fields aus der Superklasse, stundenlohn und monatliche Stunden
	public hourlyEmployee(String name, int employeeId, int monthlyHours, double hourlyRate) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.monthlyHours = monthlyHours;
	}
	
	//Fügt einen festgelegten betrag zu den Stunden hinzu und gibt dei neuen aus
	public int addHours(int hour) {
		monthlyHours += hour;
		System.out.printf("Neue Stunden: %d %n", monthlyHours);
		return hour;
		
	}
	
	//setzt die Stunden auf 0 zurück
	public void resetHours() {
		monthlyHours = 0;
		System.out.printf("Zurückgesetzte Stunden: %d %n %n", monthlyHours);
	}
	
	//stundenlohn wird auf einen festgelegten wert verändert
	public void changeHourlyRate(double change) {
		hourlyRate = change;
		System.out.printf("Neuer Stundenlohn: %.3f %n", hourlyRate);
	}
	
	
	//Gibt den Monatsgehalt aus
	@Override
	public void calculateMonthlySalary() {
		double monthlyRate = monthlyHours * hourlyRate;
		System.out.printf("Das Monatsgehalt beträgt: %.3f %n", monthlyRate);
	}
	
	

}
