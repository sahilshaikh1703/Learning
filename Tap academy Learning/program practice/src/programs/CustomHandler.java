package programs;

import java.util.Scanner;

class customerException extends Exception {
	public String getMessage() {
		return "Maximux invalid pin input reached ";
	}

}

class ATM {

	private int pin = 1111;

	void validate() throws customerException {
		System.out.println("Welcome to the ATM");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your pin");
		int userInput = scan.nextInt();
		if (pin == userInput) {
			System.out.println("Pin validated successfully ");
		} else {

			customerException ue = new customerException();
			throw ue;
		}
	}
}

public class CustomHandler {

	public static void main(String[] args) {
		ATM a1 = new ATM();
		try {
			a1.validate();

		} catch (customerException ue) {
			try {
				a1.validate();
			} catch (customerException e1) {
				try {
					a1.validate();
				} catch (customerException e2) {
					System.out.println(e2.getMessage());
					
					System.exit(0);
				}
			}

		}

	}

}
