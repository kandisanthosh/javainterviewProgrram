package corejava.interview.programs.sorting;

/**
 * 2. Selection Sort
 * 
 * Selection Sort divides the input list into two parts: a sorted and an
 * unsorted region. It repeatedly selects the smallest (or largest, depending on
 * sorting order) element from the unsorted region and moves it to the end of
 * the sorted region.
 */
public class SelectionSort {

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < array.length ; j++) {

				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp=array[minIndex];
			array[minIndex]=array[i];
			array[i]=temp;
		}

	}

	public static void main(String[] args) {

		int[] array = { 45, 65, 12, 13, 14, 15, 16, 18, 23 };
		selectionSort(array);

		for (int num : array) {

			System.out.print(num + "  ");
		}

	}

}
