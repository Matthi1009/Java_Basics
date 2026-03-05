package demo;

public class RunCode {
	public static void main(String[] args) {
		Person[] persons = new Person[2];
		
		persons[0] = new Person("Schleef");
		persons[1] = new Student("Felix", 1244);
		
		persons[1].getName();
		
		if (persons[1] instanceof Student) {
			//varianten1:
			Student s = (Student)persons[1];
			s.getmatNr();
			
			//variante2:
			((Student)persons[1]).getmatNr();
		}
		
		for (int idx = 0; idx < persons.length; idx++) {
			System.out.println(persons[idx].getName());
		}
		
		for (Person p : persons) {
			System.out.println(p.getName());
		}
	}
}
