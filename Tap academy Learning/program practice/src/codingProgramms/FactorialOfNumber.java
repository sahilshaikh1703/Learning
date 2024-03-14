package codingProgramms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number which you want the exponantial for: ");
		int n = scan.nextInt();
		
		double exp = 1 ;
		for (int i=n; i>0 ; i--) {
			exp = exp * i ;
		}
		
System.out.println("The exponantial of " + n + " is: " + exp);
	}

}
