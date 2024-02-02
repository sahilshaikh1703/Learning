package programs;

import java.util.Scanner;

public class indexOfmethodf {

	static int indexOf(String s, String c) {

		char key = c.charAt(0);

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == key)
				return i;
		}
		return -1;
	}

	static int indexOf(String s, String c, int k) {

		char key = c.charAt(0);
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == key)
				count++;

			if (count == k)
				return i;
		}
		return -1;
	}

	static int lastIndexOf(String s, String c) {

		char key = c.charAt(0);
		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) == key)
				return i;
		}
		return -1;
	}

	static String trim(String s) {

		int start = 0;
		int end = 0;
		String S = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				start = i;
				break;
			}

		}

		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) != ' ') {
				end = i;
				break;
			}
		}

		for (int i = start; i <= end; i++) {
			S = S + s.charAt(i);

		}
		return S;

	}

	static char[] toCharArray(String s) {

		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {

			c[i] = s.charAt(i);
		}
		return c;
	}

	static String equals(String s1, String s2) {
		String status = null;

		if (s1.length() == s2.length()) {

			for (int i = 0; i < s1.length(); i++) {

				if (s1.charAt(i) == s2.charAt(i)) {
					status = "True";

				} else {
					status = "False";
					break;
				}

			}

		}
		return status;

	}

	static boolean startWith(String s1, String s2) {

		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == s1.charAt(i))
				return true;

			else {
				return false;
			}
		}
		return true;

	}

	static void endsWith(String s1, String s2) {

		int ls1 = s1.length() - 1;
		int ls2 = s2.length() - 1;

		String compare = "";

		for (int i = ls1 - ls2; i <= ls1; i++) {

			compare = compare + s1.charAt(i);
		}

		if (s2.equals(compare)) {
			System.out.println("equal");
		}

		else {
			System.out.println("Not equal");
		}

	}

	static boolean contains(String s1, String s2) {

		int count = 0;

		for (int i = 0; i < s1.length() && count < s2.length(); i++) {

			if (s1.charAt(i) == s2.charAt(count)) {
				count++;
			} else {
				count = 0;
			}
		}
		if (count == s2.length())
			return true;

		else
			return false;
	}

	static char[] replace(char[] chararray, String s2, String s3) {

		char old_c = s2.charAt(0);
		char new_c = s3.charAt(0);

		for (int i = 0; i < chararray.length; i++) {

			if (chararray[i] == old_c) {
				chararray[i] = new_c;
			}
		}
		return chararray;// Returning char array
		// return new String(s); // Returning String

	}

	static String substring(String s , int startIndex) {
		String t = "";
		
		for(int i=startIndex; i<s.length();i++) {
			t =  t + s.charAt(i) ; 
		}
		return t;
		
	}
	
	static String substring(String s , int startIndex, int endIndex) {
		String t = "";
		
		for(int i=startIndex; i<= endIndex;i++) {
			t =  t + s.charAt(i) ; 
		}
		return t;
		
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
//		System.out.println("Enter the Char to look for ");
//		String c = scan.nextLine();
//		System.out.println("Enter the occurance no");
//		int k = scan.nextInt();
//		System.out.println(indexOf(s, c, k));
//		System.out.println(lastIndexOf(s, c));
//		System.out.print(trim(s));
//		System.out.println(toCharArray(s));

//		System.out.println("Enter the String");
//
//		String s1 = scan.nextLine();
//		String s2 = scan.nextLine();
//		String s3 = scan.nextLine();

//		char s4 = scan.next().charAt(0); //

//		char[] chararray = s1.toCharArray();

//		System.out.println(equals(s1, s2));
//		System.out.println(startWith(s1, s2));
//		System.out.println(endsWith(s1, s2));
//		endsWith(s1, s2);
//		System.out.println(contains(s1, s2));
//		System.out.println(replace(chararray, s2, s3));
		
		int startInxed = scan.nextInt();
		int endIndex = scan.nextInt();
		System.out.println(substring(s, startInxed));
		System.out.println(substring(s, startInxed, endIndex));
	}

}
