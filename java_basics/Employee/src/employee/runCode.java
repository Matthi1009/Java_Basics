package employee;

public class runCode {
	public static void main(String[] args) {
		//Neues Objekt als hourlyEmployee
		hourlyEmployee hEmployee = new hourlyEmployee("Peter", 1, 135, 12.2);
		
		//Alle methoden Aufgerufen
		System.out.println(hEmployee.toString());
		hEmployee.changeName("Helmut");
		hEmployee.addHours(4);
		hEmployee.changeHourlyRate(18.2);
		hEmployee.calculateMonthlySalary();
		hEmployee.resetHours();
		
		//Neues Objekt als salariedEmployee
		salariedEmployee sEmployee = new salariedEmployee("Franz", 2, 2200);
		
		//Alle methoden aufgerufen
		System.out.println(sEmployee.toString());
		sEmployee.changeName("Rudi");
		sEmployee.givenRaise(12);
		sEmployee.calculateMonthlySalary();
		
	}
}
