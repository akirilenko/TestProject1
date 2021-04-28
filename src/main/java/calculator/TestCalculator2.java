package calculator;

import java.util.ArrayList;
import java.util.List;

public class TestCalculator2 {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Input expression for calcutation (Sample : 1 + 2)");
		// String s = scan.nextLine();
		String s = "-3*9/(2+3*(-2+1))-(6+2)*3";
		System.out.println(roundBracketCheck(s));

	}

	//
	private static String roundBracketCheck(String s) {
		String r = "";
		while (s.split("(\\-\\B|\\+|\\/|\\*)").length > 2) {
			int openBr = s.indexOf("(");
			int openBrSecond = s.substring(openBr + 1).indexOf("(") + openBr + 1;
			int closeBr = s.indexOf(")");
			if ((openBrSecond > closeBr) || (openBrSecond == -1 && openBr == -1 && closeBr == -1)) {
				if (openBr != -1 && closeBr != -1) {
					String s1 = s.substring(openBr + 1, closeBr);
					String m = Double.toString(TestCalculator2.calcExpr(s1));
					s = s.replace(s.substring(openBr, closeBr + 1), m);
				} else {

					// тут дописать обработку выхода (openBrSecond==-1&& openBr == -1 && closeBr ==
					// -1) или попроавить условие в while
					// System.out.println(TestCalculator2.calcExpr(s));
					r = Double.toString(TestCalculator2.calcExpr(s));
					s = r;
				}
			} else {
				String s2 = s.substring(openBrSecond + 1, closeBr);
				r = Double.toString(calcExpr(s2));
				s = s.replace(s.substring(openBrSecond, closeBr + 1), r);
				// roundBracketCheck(s2);
			}
		}
		return s;
	}

	// deleting of the empty elements
	private static String[] operandsClean(String[] oper, int length) {
		String partsOperandsC[] = new String[length];
		int j = 0;
		for (int i = 0; i < oper.length; i++) {
			if (oper[i].length() > 0) {
				partsOperandsC[j] = oper[i];
				j++;
			}
		}
		return partsOperandsC;
	}

	private static double calcExpr(String s) {
 
		String s1 = "", s0="";
		if (s.startsWith("-")) {
			s1 = s.substring(1);
			s0="1";
		} else {
			s1 = s;
		}

		String parts[] = s1.split("(\\-|\\+|\\/|\\*)"); 
		if (s0=="1") { parts[0]="-"+parts[0];}

		if (s.startsWith("-")) {
			s1 = s.substring(1);
		} else {
			s1 = s;
		}
		String partsOperands[] = operandsClean(s1.split("\\d|[.]"), parts.length - 1);
		List<String> al = new ArrayList<String>();

		for (int i = 0; i < parts.length; i++) {
			al.add(parts[i]);
			if (i <= partsOperands.length - 1) {
				al.add(partsOperands[i]);
			}
		}
		Calculator c = new Calculator();
		double result = 0;
		while (al.size() > 1) {

			int signIndexDiv = al.indexOf("/");
			int signIndexMl = al.indexOf("*");
			int signIndexPl = al.indexOf("+");
			int signIndexSub = al.indexOf("-");

			if (signIndexDiv > -1) {
				result = c.div(Double.valueOf(al.get(signIndexDiv - 1)), Double.valueOf(al.get(signIndexDiv + 1)));
				al.remove(signIndexDiv - 1);
				al.remove(signIndexDiv - 1);
				al.remove(signIndexDiv - 1);
				al.add(signIndexDiv - 1, Double.toString(result));

			}

			if (signIndexMl > -1) {
				result = c.mult(Double.valueOf(al.get(signIndexMl - 1)), Double.valueOf(al.get(signIndexMl + 1)));
				al.remove(signIndexMl - 1);
				al.remove(signIndexMl - 1);
				al.remove(signIndexMl - 1);
				al.add(signIndexMl - 1, Double.toString(result));

			}

			if (signIndexPl > -1 && signIndexDiv == -1 && signIndexMl == -1) {
				result = c.add(Double.valueOf(al.get(signIndexPl - 1)), Double.valueOf(al.get(signIndexPl + 1)));
				al.remove(signIndexPl - 1);
				al.remove(signIndexPl - 1);
				al.remove(signIndexPl - 1);
				al.add(signIndexPl - 1, Double.toString(result));

			}

			if (signIndexSub > -1 && signIndexDiv == -1 && signIndexMl == -1) {
				result = c.sub(Double.valueOf(al.get(signIndexSub - 1)), Double.valueOf(al.get(signIndexSub + 1)));
				al.remove(signIndexSub - 1);
				al.remove(signIndexSub - 1);
				al.remove(signIndexSub - 1);
				al.add(signIndexSub - 1, Double.toString(result));

			}
		}
		// System.out.println(result);
		return result;
		/*
		 * result = Double.valueOf(parts[0]); for (int i = 1; i < parts.length; i++) {
		 * 
		 * switch (partsOperands[i - 1]) { case "+": result = c.add(result,
		 * Double.valueOf(parts[i])); System.out.println(result); break; case "-":
		 * result = c.sub(result, Double.valueOf(parts[i])); System.out.println(result);
		 * break; case "/": result = c.div(result, Double.valueOf(parts[i]));
		 * System.out.println(result); break; case "*": result = c.mult(result,
		 * Double.valueOf(parts[i])); System.out.println(result); break;
		 * 
		 * }
		 * 
		 * }
		 */
	}

}
