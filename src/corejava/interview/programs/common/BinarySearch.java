package corejava.interview.programs.common;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}
