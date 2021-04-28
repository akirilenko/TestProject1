package calculator;

import java.util.Scanner;

public class TestSimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x = 0, y = 0;
		String operation = "";
		SimpleCalculator calc = new SimpleCalculator();
		while (!operation.trim().equalsIgnoreCase("N")) {
			System.out.println("Choose operation");
			System.out.println(" + , - , / , * , M+ , M- , MR , MC or N to finish calculation");
			operation = scan.nextLine().trim();
			if (operation.trim().equalsIgnoreCase("+") | operation.trim().equalsIgnoreCase("-")
					| operation.trim().equalsIgnoreCase("*") | operation.trim().equalsIgnoreCase("/")) {
				System.out.println("Input first number ");
				x = scan.nextDouble();
				scan.nextLine();
				System.out.println("Input second number ");
				y = scan.nextDouble();
				scan.nextLine();
			}
			;
			// switch перенесен в базовый класс SimpleCalculator
			calc.calculateExecute(operation, x, y);

		}
		System.out.println("The End");
		scan.close();

	}

}
