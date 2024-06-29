package corejava.interview.programs.common;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        boolean isPalindrome = str.equals(reversed);
        System.out.println(isPalindrome);
    }
}
