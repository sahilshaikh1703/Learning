package codingProgramms;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println("Enter the number till where the Fibonacci series has to be printed ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        GenerateFibonacciSeries(n);
    }

    static void GenerateFibonacciSeries(int n) {
        int[] fs = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fs[0] = 0;
            } else if (i == 1) {
                fs[1] = 1;
            } else {
                fs[i] = fs[i - 1] + fs[i - 2];
            }
            System.out.println(fs[i]);
        }
    }
}
