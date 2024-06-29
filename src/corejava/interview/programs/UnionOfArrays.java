package corejava.interview.programs;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        Set<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        System.out.println(union);
    }
}
