package corejava.interview.programs.leetCode;
/***
	 * To remove a specific element from an array in Java, you can use a 
	 * two-pointer technique to overwrite the elements that need to be removed. Here is a method to achieve this:
	
	Approach
	Initialize Pointers: Use a pointer to keep track of the position in the new array.
	Traverse and Compare: Traverse the array while comparing each element with the target element to be removed.
	Overwrite Elements: If the current element is not equal to the target element, place it in the new array position and increment the pointer.
	Java Implementation
	Here is a Java method to remove a specific element from an array:
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0; // Pointer for the position in the new array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 2, 5};
        int val = 2;

        int newLength = removeElement(nums, val);

        System.out.println("Array after removing element " + val + ": ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
