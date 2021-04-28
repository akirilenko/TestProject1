package Sort;

public class BinarySearch {

	public static int BinarySearchInt(int[] a, int x) {
		// Проверить, имеет ли смыл вообще выполнять поиск:
		// - если длина массива равна нулю - искать нечего;
		// - если искомый элемент меньше первого элемента массива, значит, его в массиве
		// нет;
		// - если искомый элемент больше последнего элемента массива, значит, его в
		// массиве нет.
		if ((a.length == 0) || (x < a[0]) || (x > a[a.length - 1]))
			return -1;

		// Приступить к поиску.
		// Номер первого элемента в массиве.
		int first = 0;
		// Номер элемента массива, СЛЕДУЮЩЕГО за последним
		int last = a.length;

		// Если просматриваемый участок не пуст, first < last
		while (first < last) {
			int mid = first + (last - first) / 2;

			if (x <= a[mid])
				last = mid;
			else
				first = mid + 1;
		}
		// Теперь last может указывать на искомый элемент массива.
		if (a[last] == x)
			return last;
		else
			return -1;
	}
}
