package Athlete;


public class swimmer extends athlete {
	private String swimmstyle;
	
	public swimmer(String name, int age, String swimmstil) {
		super(name, age);
		this.swimmstyle = swimmstil;
	}
	
	public String getSwimmStil() {
		return swimmstyle;
	}
	
	
	@Override
	public void practice(double minutes) {
		super.practice(minutes);
		System.out.printf("Der Schwimmer übt %s%n", swimmstyle);
	}
	
	@Override
	public void celebrate() {
		System.out.println("Der Schwimmer macht einen Regentanz. \n");
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + "Schwimmstil: %s%n", swimmstyle);
		
		
		
	}
	
}
