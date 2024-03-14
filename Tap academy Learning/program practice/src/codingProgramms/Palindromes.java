package codingProgramms;

import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check the pallandrom");

		String word = scan.next();
		boolean status = checkPalan(word);
		if (status == true) {
			System.out.println("It is a pallandrom");
		} else
			System.out.println("It is not a pllandrom");

	}

	public static boolean checkPalan(String word) {

		int i = 0, j = word.length() - 1;

		boolean charEqual = true;

		while (charEqual == true && i < word.length() && j >= 0) {

			if (word.charAt(i) == word.charAt(j)) {

				charEqual = true;
				i++;
				j--;

				charEqual = true;
			} else {

				charEqual = false;
			}
		}
		return charEqual;
	}
}
