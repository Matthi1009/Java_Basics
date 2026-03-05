package calculator;

public abstract class Operation {
	//fields
	private double a;
	private double b;
	
	public Operation(Double a, Double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
}
