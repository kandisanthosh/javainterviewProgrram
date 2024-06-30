package corejava.interview.programs.sorting;
/**
 * 3. Insertion Sort

	Insertion Sort builds the final sorted array one item at a time.
 	It is much more efficient for small data sets or partially sorted arrays.
 	
 */

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

