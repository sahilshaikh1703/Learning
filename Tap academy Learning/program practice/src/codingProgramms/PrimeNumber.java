package codingProgramms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number is prime ");
		} else
			System.out.println("Number is not prime ");
	}

}
