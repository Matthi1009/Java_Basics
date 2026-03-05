package calculator;

public class SquareRoot extends Operation {
	
	public SquareRoot(Double a, Double b) {
		super(a, b);
	}
	
	public void Calculate() {
		double result = Math.pow(getB(), (1/getA()));
		System.out.printf("Das Ergebniss der %.2f. Wurzel von %.2f ist %f %n",getA(), getB(), result);
	}
	
	public boolean checkA() {
		if (getA() <0) {
			throw new IllegalArgumentException("Die erste Zahl kann nicht negativ sein!");
		} else if (getA() % 2 == 0 & getB() < 0) {
			throw new IllegalArgumentException("Wenn die erste Zahl gerade ist darf die Zweite nicht negativ sein!");
		} else {
			return true;
		}
	}
}
