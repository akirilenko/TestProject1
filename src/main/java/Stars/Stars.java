package Stars;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Введите любое целое число от 1 до 10: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j <= i)
					System.out.print(j + 1 + " ");
				else
					System.out.print("*" + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
 
 
