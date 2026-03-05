package calculator;

public class Logarithm extends Operation {
	
	public Logarithm(Double a, Double b) {
		super(a, b);
	}
	
	public void Calculate() {
		double result = Math.log(getB()) / Math.log(getA());
		System.out.printf("Der Lofarithmus von %f zur Basis von %f ist %f", getB(), getA(), result);
	}
	
	public boolean checkA() {
		if (getA() < 0) {
			throw new IllegalArgumentException("Die erste Zahl kann nicht negativ sein!");
		} else if (getA() == 1) {
			throw new IllegalArgumentException("Die erste Zahl kann nicht 1 sein!");
		} else if (getB() < 0) {
			throw new IllegalArgumentException("Die zweite Zahl kann nicht negativ sein!");
		} else {
			return true;
		}
	}
}
