package programs;

import java.util.StringTokenizer;

public class countWordCharc {

	static int countSpaces(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	
	static int countWprd(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		return count+1;
	}
	
	
	static int charCount(String s ) {
	
		int count = 0;
		
		char key = s.charAt(0);  // if want to compare the char at the 0th position 		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String s = "How are you";
		char c[] = {'a' , 'b' , 'g'};
		if(Character.isDigit(c[0]))
			
	
		
	
//		System.out.println(countSpaces(s));
//		System.out.println(countWprd(s));
		System.out.println(charCount(s));
		
		
	}
}
