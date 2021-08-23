package Section6oop.SumCalculator;

public class SimpleCalculator {
	private double firstNumber;
	private double sencondNumber;
	
	public double getFirstNumber() {
		return this.firstNumber;
	}
	
	public double getSecondNumber() {
		return this.sencondNumber;
	}
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(double sencondNumber) {
		this.sencondNumber = sencondNumber;
	}
	
	public double getAdditionResult() {
		return this.firstNumber + this.sencondNumber;
	}
	
	public double getSubtractionResult() {
		return this.sencondNumber - this.firstNumber;
	}
	
	public double getMultiplicationResult() {
		return this.sencondNumber * this.firstNumber;
	}
	
	public double getDivisionResult() {
		if (this.sencondNumber == 0) {
			return 0;
		}
		return this.firstNumber / this.sencondNumber;
	}
	
	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());
	}
	
}
