package TestPart;

import Sort.*;

public class TestBinarySearch {

	// binary search in the sorted mass
	// Returns index of an element , returns -1 if an element was not founded

	public static void main(String[] args) {
		// Setting the first mass content id range from 1 to 500
		// int [] a = { 20, 2, 3,1, 5, 7, 12, 9,15 };
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = Rnd.rndInt(1, 50);
		}

		// Printing the first content of mass
		System.out.println("Printing the first content of mass:");
		BubbleSort.printMass(a);

		// Sorting the mass
		a = BubbleSort.sortMyMass(a);

		// Printing the sorted content of mass
		System.out.println("Printing the sorted content of mass:");
		BubbleSort.printMass(a);

		// The number -1 is searching in the mass
		System.out.println("Find -1:" + BinarySearch.BinarySearchInt(a, -1));

		// Generate random element for search in the archive
		int RndElementToFind = Rnd.rndInt(1, 50);

		System.out.println("Find " + RndElementToFind + ":" + BinarySearch.BinarySearchInt(a, RndElementToFind));

		RndElementToFind = Rnd.rndInt(1, 50);
		System.out.println("Find " + RndElementToFind + ":" + BinarySearch.BinarySearchInt(a, RndElementToFind));

		RndElementToFind = Rnd.rndInt(1, 50);
		System.out.println("Find " + RndElementToFind + ":" + BinarySearch.BinarySearchInt(a, RndElementToFind));

		// The number 50 is searching in the mass
		System.out.println("Find 20:" + BinarySearch.BinarySearchInt(a, 50));

	}

}
