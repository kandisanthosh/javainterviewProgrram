package corejava.interview.programs;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = { 1, 10, 3, 4, 5 };
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println(max);
	}
}
