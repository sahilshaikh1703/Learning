package codingProgramms;

import java.util.Scanner;

public class FirstNPrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the value of n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		if (n <= 0) {
			System.out.println("Invalid input. Please enter a positive integer for n.");
			return;
		}

		for (int i = 2; i <= n; i++) {

			boolean status = isPrime(i);
			if (status == false) {
				System.out.println(i);
			}

		}
	}

	// Function to check if a number is prime
	private static boolean isPrime(int currentNum) {
		int count = 0;

		for (int i = 2; i <= currentNum; i++) {
			if (currentNum % i == 0) {
				count++;

			}
			if (count == 2) {
				return true;
			}
		}
		return false;

	}
}