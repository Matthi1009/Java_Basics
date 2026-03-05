package calculator;

public class Potentiate extends Operation{
	
	public Potentiate(Double a, Double b) {
		super(a, b);
	}
	
	public void Calculate() {
		double result = Math.pow(getA(), getB());
		System.out.printf("%f hoch %f = %f", getA(), getB(), result);
	}
	
	public boolean checkB() {
		if (getB() < -20 || getB() > 20) {
			throw new IllegalArgumentException("Die zweite Zahl muss zwischen inklusive -20 und 20 liegen!");
		} else {
			return true;
		}
	}
}
