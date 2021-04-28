package TestPart;

import java.util.Scanner;

import Sort.*;

public class TestAdditionalTask2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you wand to check Odd Even For number ?" + " (Y/N) ");
		String answe = "";
		answe = scan.nextLine().trim().toUpperCase();
		String checkingProgress = "Y";
		while (checkingProgress.equals(answe)) {

			System.out.println("Enter the number for checking");
			int num = scan.nextInt();
			System.out.println("The number " + num + " is a " + AdditionalTask2.CheckOddEven(num));
			System.out.println("Do you wand to continue number checking ?" + " (Y/N) ");

			// additional reading of end of row after nextInt()
			// https://ru.stackoverflow.com/questions/499681/%D0%9E%D1%81%D0%BE%D0%B1%D0%B5%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B8-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-scanner-nextline
			scan.nextLine();
			answe = scan.nextLine().trim().toUpperCase();
		}
		System.out.println(" Odd Even checking was stoped.");

		// Call PrintNumberInWord
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println(AdditionalTask2.PrintNumberInWord(num));

		scan.close();

		// SumAndAverage calculation
		System.out.println("Sum of elements from 1 to 100 is " + (int) AdditionalTask2.SumAndAverage(100)[0]);
		System.out.println("AVG of elements from 1 to 100 is " + AdditionalTask2.SumAndAverage(100)[1]);

		// pi calculation
		System.out.println("pi = " + AdditionalTask2.LeibnizSeries(100) + " 100 iterations");
		System.out.println("pi = " + AdditionalTask2.LeibnizSeries(1000) + " 1000 iterations");
		System.out.println("pi = " + AdditionalTask2.LeibnizSeries(10000) + " 10000 iterations");
		System.out.println("pi = " + AdditionalTask2.LeibnizSeries(100000) + " 100000 iterations");
		System.out.println("pi = " + AdditionalTask2.LeibnizSeries(1000000) + " 1000000 iterations");
		System.out.println("pi = " + AdditionalTask2.LeibnizSeries(1000000000) + " 1000000000 iterations");
		System.out.println("PI = " + Math.PI + " (Math)");

		// HarmonicSum calculation
		System.out.println("HarmonicSum = " + AdditionalTask2.HarmonicSum(50000) + " 50000 iterations");
	}

}
