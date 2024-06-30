package corejava.interview.programs.leetCode;

/**
 * Here is a Java method to remove duplicates from a sorted array such that each
 * element appears at most twice:
 * 
 * To remove duplicates from a sorted array such that each element appears at
 * most twice, you can follow this approach in Java:
 * 
 * Approach Initialize Pointers: Use a pointer to keep track of the position in
 * the new array. Traverse and Compare: Traverse the array while comparing the
 * current element with the element two positions behind in the new array. Allow
 * Two Occurrences: If the current element is different from the element two
 * positions behind, place it in the new array.
 */
public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
		if (nums.length <= 2)
			return nums.length;

		int index = 2; // start from the third element

		for (int i = 2; i < nums.length; i++) {
			if (nums[i] != nums[index - 2]) {
				nums[index] = nums[i];
				index++;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5 };

		int newLength = removeDuplicates(nums);

		System.out.println("Array after removing duplicates: ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
