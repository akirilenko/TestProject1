package Sort;

public class AdditionalTask2 {

	/**
	 * Write a program called CheckOddEven which prints "Odd Number" if the int
	 * variable “number” is odd, or “Even Number” otherwise.
	 */
	public static String CheckOddEven(int num) {
		if (num != 0) {
			if ((num % 2) > 0)
				return "Odd Number";
			else
				return "Even Number";
		} else
			return "Odd Even undefined for Zero";
	}

	/**
	 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
	 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other,
	 * respectively.
	 */

	public static String PrintNumberInWord(int num) {
		String word1  ;
		switch (num) {
		case 1:
			word1 = "One";
			break;
		case 2:
			word1 = "Two";
			break;
		case 3:
			word1 = "Three";
			break;
		case 4:
			word1 = "Four";
			break;
		case 5:
			word1 = "Five";
			break;
		case 6:
			word1 = "Six";
			break;
		case 7:
			word1 = "Seven";
			break;
		case 8:
			word1 = "Eight";
			break;
		case 9:
			word1 = "Nine";
			break;
		default:
			word1 = "OTHER";
		}
		return word1;
	}

	/**
	 * Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to
	 * 100. Also compute and display the average.
	 */
	public static double[] SumAndAverage(int num) {
		double response[] = new double[2];
		int sumValue = 0;
		double avgValue = 0;
		for (int i = 1; i <= num; i++) {
			sumValue += i;
		}
		avgValue = sumValue / num;
		response[0] = sumValue;
		response[1] = avgValue;
		return response;
	}

	// ряд Лейбница. π = (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) -
	// (4/15) ...
	public static double LeibnizSeries(int iterationCount) {

		double pi = 0;
		double k = 1;
		for (int i = 1; i <= iterationCount * 2; i = i + 2) {
			pi = pi + k * 4 / i;
			// for debug
			// if (k>0) s="+"; else s ="-"; System.out.println( s +" " + "4/" + i );
			k = k * (-1);
		}
		return pi;
	}

	// Write a program called HarmonicSum to compute the sum of a harmonic series,
	// as shown below, where n=50000
	// harmonic = 1+ 1/2+ 1/3+ 1/4+ 1/5+ ......1/n
	public static double HarmonicSum(int iterationCount) {
		double harmonic = 0;
		double k = 1;
		for (int i = 1; i <= iterationCount; i++) {
			harmonic += k / i;
		}
		return harmonic;
	}

}
