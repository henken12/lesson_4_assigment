package Assigment3;

public class Recursive {
        public static void main(String[] args) {
            printReverse(1234);
        }
        public static void printReverse(int n) {
            if (n < 10) {
                System.out.print(n);
            } else{
                System.out.print(n % 10);
                printReverse(n / 10);
            }
        }
    }

