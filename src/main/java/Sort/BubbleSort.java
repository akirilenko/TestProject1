package Sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myMass = { 1, 9, 5, 6, 3, 7, 4 };
		System.out.println("Вывод на печать первичного состояния массива:");
		printMass(myMass);
		
		myMass = sortMyMass (myMass);

		System.out.println("Вывод на печать отортированного  массива:");
		printMass(myMass);
	}

	// Процедура вывода на печать массива
	public static void printMass(int[] myMass) {
		for (int i = 0; i < myMass.length; i++) {
			if (i < myMass.length - 1)
				System.out.print(myMass[i] + ",");
			else {
				System.out.print(myMass[i]);
				System.out.println();
			}
		}
	}
	// Процедура сортировки
	public static int[] sortMyMass(int[] myMass) {
		int minElement;
		for (int i = 0; i < myMass.length; i++) {
			minElement = myMass[i];
			for (int j = i + 1; j < myMass.length; j++) {
				if (myMass[j] < minElement) {
					minElement = myMass[j];
					myMass[j] = myMass[i];
					myMass[i] = minElement;
				}
			}
		}
		return myMass;
	}
}
