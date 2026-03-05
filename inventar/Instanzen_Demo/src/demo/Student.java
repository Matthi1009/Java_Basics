package demo;

public class Student extends Person {
	private int matNr;
	
	public Student(String name, int matNr) {
		super(name);
		this.matNr = matNr;
	}
	
	public int getmatNr() {
		return matNr;
	}
}
