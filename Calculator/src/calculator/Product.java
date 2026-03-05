package calculator;

public class Product extends Operation {
		
	public Product(Double a, Double b) {
		super(a, b);
	}
	
	public void Calculate() {
		double result = getA();
		for (double i = getA(); i < getB(); i++) {
			result *= i + 1;
		}
		System.out.printf("Das Produkt aller Zahlen von %f bis %f ist %f", getA(), getB(), result);
	}
	
	public boolean checkA() {
		if (getA() > getB()) {
			throw new IllegalArgumentException("Die erste Zahl kann nicht größer als die Zweite Sein!");
		} else {
			return true;
		}
	}
	
}
