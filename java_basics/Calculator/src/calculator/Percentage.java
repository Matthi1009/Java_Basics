package calculator;

public class Percentage extends Operation{
	
	public Percentage(Double a, Double b) {
		super(a, b);
	}
	
	public void Calculate() {
		double result = (getA()/getB()) * 100;
		System.out.printf("%f prozent von %f sind %f prozent", getA(), getB(), result);
	}
	
	public boolean checkB() {
		if (getB() == 0) {
			throw new IllegalArgumentException("Die zweite Zahl kann nicht 0 sein!");
		} else {
			return true;
		}
	}
}
