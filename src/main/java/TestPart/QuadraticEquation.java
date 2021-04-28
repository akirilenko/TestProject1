package TestPart;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1, b = 1, c = 0;
		double x1, x2, d;

		d = Math.pow(b, 2) - 4 * a * c;
		if (a != 0) {
			if (d < 0) {
				System.out.println("Решения нет");
			} else {
				if (d == 0) {
					x1 = -b / (2 * a);
					System.out.println("x1 и  x2 = " + x1);

				} else {
					x1 = (-b + Math.sqrt(d)) / (2 * a);
					x2 = (-b - Math.sqrt(d)) / (2 * a);
					System.out.println("x1 = " + x1);
					System.out.println("x2 = " + x2);
				}
			}
		}

		else {
			System.out.println("Уроавнение не квадратное! ");
			if (b != 0) {
				x1 = -c / b;
				System.out.println("x1 и  x2 = " + x1);
			} else if (c == 0) {
				System.out.println("X может принимать любое значение");
			} else {
				System.out.println("Решения нет");
			}
			{
			}
		}
	}
}
