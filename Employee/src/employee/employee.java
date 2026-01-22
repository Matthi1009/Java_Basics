package employee;

public abstract class employee {
	//Zwei Fields für Name und Id
	private String name;
	public  int employeeId;
	
	//Constructor für die Fields
	public employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	//Methode die den Namen ändert und überprüft ob er geändert werden kann
	public void changeName(String newName) {
		//if ob der name geändert werden kann
		if (newName == null) {
			System.out.println("Ungültig \n");
		} else {
			name = newName;
			System.out.printf("Neuer Name: %s %n", name);
		}
	}
	//Methode für den monatlichen gehalt
	public abstract void calculateMonthlySalary();
	
	//toString für die Ausgabe von namen und id
	@Override
	public String toString() {
		return String.format("Name: %s %nMitarbeiter ID: %d %n", name, employeeId);
	}

}
