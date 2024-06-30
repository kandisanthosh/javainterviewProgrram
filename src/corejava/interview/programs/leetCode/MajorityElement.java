package corejava.interview.programs.leetCode;
/****
 * 
	To find the majority element in an array (an element that appears more than half the times), you can use the Boyer-Moore Voting Algorithm. This algorithm works in O(n) time complexity and O(1) space complexity.
	
	Approach
	Candidate Selection: Identify a potential candidate for the majority element.
	Candidate Verification: Verify if the candidate is indeed the majority element.
	Java Implementation
	Here is a Java method to find the majority element using the Boyer-Moore Voting Algorithm:
	
	
	Explanation
	Candidate Selection:
	
	The findCandidate method traverses the array while maintaining a count.
	When the count is zero, it sets the current element as the candidate.
	It increments the count if the current element is the same as the candidate, and decrements it otherwise.
	Candidate Verification:
	
	Since the problem guarantees the presence of a majority element, we skip explicit verification.
	If verification is needed, you can add an additional step to count occurrences of the candidate to ensure it appears more than half the times.
	Verification (Optional)
	If you want to add verification to ensure the candidate is indeed the majority element, you can modify the code as follows:
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = findCandidate(nums);
        return verifyCandidate(nums, candidate) ? candidate : -1;
    }

    private static int findCandidate(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    private static boolean verifyCandidate(int[] nums, int candidate) {
        int count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return count > nums.length / 2;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        int majorityElement = majorityElement(nums);

        if (majorityElement != -1) {
            System.out.println("Majority element: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}

