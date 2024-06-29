package corejava.interview.programs;

public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        int gcd = 1;
        int lcm = (a * b) / gcd(a, b);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
