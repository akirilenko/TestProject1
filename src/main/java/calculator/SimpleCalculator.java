package calculator;

public class SimpleCalculator {
	private double memory;
	private static double currentResult;

	public SimpleCalculator() {
	}

	public double getMemory() {
		return memory;
	}

	public static double getCurrent_result() {
		return currentResult;
	}

	public static void add(double x, double y) {
		currentResult = x + y;
	}

	public static void sub(double x, double y) {
		currentResult = x - y;
	}

	public static void div(double x, double y) {
		if (y != 0) {
			currentResult = x / y;
		} else {
			System.out.println("To divide by zero restricted");
			currentResult = 0;
		}
	}

	public static void mult(double x, double y) {
		currentResult = x * y;
	}

	public void addToMemory() {
		memory += currentResult;
	}

	public void subFromMemory() {
		memory -= currentResult;
	}

	public double memoryOut() {
		return memory;
	}

	public void memoryClean() {
		memory = 0;
	}

	public void calculateExecute(String operation, double x, double y) {
		switch (operation) {
		case "+":
			SimpleCalculator.add(x, y);
			System.out.println("Result: " + SimpleCalculator.getCurrent_result());
			break;
		case "-":
			SimpleCalculator.sub(x, y);
			System.out.println("Result: " + SimpleCalculator.getCurrent_result());
			break;
		case "*":
			SimpleCalculator.mult(x, y);
			System.out.println("Result: " + SimpleCalculator.getCurrent_result());
			break;
		case "/":
			SimpleCalculator.div(x, y);
			System.out.println("Result: " + SimpleCalculator.getCurrent_result());
			break;
		case "M+":
			addToMemory();
			System.out.println("Memory was increased.");
			break;
		case "M-":
			subFromMemory();
			System.out.println("Memory was decreased.");
			break;
		case "MC":
			memoryClean();
			System.out.println("Memore was cleaned.");
			break;
		case "MR":
			memoryOut();
			System.out.println("Result in memory is: " + memoryOut());
			break;

		}
	}
}
