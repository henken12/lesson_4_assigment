package Assigment3;

public class Recursive2 {
    public static void main(String[] args) {
        int count = countDigits(1234);
        System.out.println("Number of digits: " + count);
    }
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }
}
