package calculator;

public class BasicArithmetic extends Operation {

	public BasicArithmetic(Double a, Double b) {
		super(a, b);
	}
	
	public void Adition() {
		double result = getA() + getB();
		System.out.printf("%f + %f = %f", getA(), getB(), result);
	}
	
	public void Subtraction() {
		double result = getA() - getB();
		System.out.printf("%f - %f = %f", getA(), getB(), result);
	}
	
	public void Multiplication() {
		double result = getA() * getB();
		System.out.printf("%f * %f = %f", getA(), getB(), result);
	}
	
	public void Division() {
		double result = getA() / getB();
		System.out.printf("%f / %f = %f", getA(), getB(), result);
	}
	
	public boolean checkB() {
		if (getB() <0) {
			throw new IllegalArgumentException("Die zwiete Zahl kann nicht negativ sein!");
		} else {
			return true;
		}
	}
}
