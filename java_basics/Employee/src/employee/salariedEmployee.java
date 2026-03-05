package employee;

public class salariedEmployee extends employee {
	//Field
	private double monthlySalary;
	
	//Constuctor mit fields aus der Superklasse und Monatsgehalt
	public salariedEmployee(String name, int employeeId, double monthlySalary) {
		super(name, employeeId);
		this.monthlySalary = monthlySalary;
	}
	
	//Der Monatsgehalt wird um einen bestimten prozentsatz erhöht
	public void givenRaise(double percent) {
		//if abfrage die prüft ob ein gültiger prozentsatz eingegeben wurde
		if (percent > 0) {
			monthlySalary = monthlySalary + ((monthlySalary/100) * percent);
			System.out.printf("Gehalt wurde erhöht! %n");
		} else {
			System.out.println("Ungültig \n");
		}
	}
	
	//Gibt den Monatsgehalt aus
	@Override
	public void calculateMonthlySalary() {
		System.out.printf("Monatsgehalt: %f", monthlySalary);
	}
	
	
}
