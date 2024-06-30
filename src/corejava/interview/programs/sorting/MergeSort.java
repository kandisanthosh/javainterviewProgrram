package corejava.interview.programs.sorting;
/***
 * 4. Merge Sort

	Merge Sort is a divide-and-conquer algorithm that divides the array into two halves,
	 recursively sorts each half, and then merges the two sorted halves.
	 
		 MERGE_SORT(arr, beg, end)  
	  
		if beg < end  
		set mid = (beg + end)/2  
		MERGE_SORT(arr, beg, mid)  
		MERGE_SORT(arr, mid + 1, end)  
		MERGE (arr, beg, mid, end)  
		end of if  
		  
		END MERGE_SORT  
	
Merge Sort Algorithm
		There are only five steps to understand Merge Sort Algorithm:
		
		Step 1: Divide Array into Two Parts.
		Step 2: Merge Sort the first part of the array.
		Step 3: Merge Sort the second part of the array.
		Step 4: Merge Both the parts.
		Step 5: Return the Sorted Array
		
		 */
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
