package programs;

import java.util.Scanner;

public class checkUpperCase {

	static int checkUpperCaseInASentense(String s ) {
		
		int count=1  ;

		for (int i=0; i<s.length();i++ ) {
			if (s.charAt(i)>='A' && s.charAt(i) <='Z')
				count++;		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String Details");
		String s = scan.next();
		System.out.println(checkUpperCaseInASentense(s));
	}

}
