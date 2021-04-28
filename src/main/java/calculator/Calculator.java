package calculator;

public class Calculator {
	private double memory; 
	private double currentResult; 

	public Calculator() { 
	}

	public double add(double x, double y) { 
		currentResult =  x + y;
		return currentResult;
	}

	public double sub(double x, double y) {
		currentResult =  x - y;
		return currentResult;
	}

	public double div(double x, double y) {
		currentResult =x / y ;
		return currentResult ;
	}

	public double mult(double x, double y) {
		currentResult = x * y;
		return currentResult ;
	}

	public double addToMemory  () {
		return  memory + currentResult ;
	}

	public double subFromMemory() {
		return memory - currentResult;
	}

	public double memoryOut() {
		return memory;
	}

	public void memoryClean() {
		 memory = 0;
	}
 

}
