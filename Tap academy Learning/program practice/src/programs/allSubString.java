package programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;
import javax.xml.transform.Templates;

public class allSubString {

	static void subStrings(String st) {

		int n = st.length();

		for (int len = 1; len <= n; len++) {
			for (int s = 0; s <= (n - len); s++) {
				for (int e = s; e <= (s + len) - 1; e++) {
					System.out.print(st.charAt(e));
				}
				System.out.println();
			}
			
		}
		
	}

	static void subStringsOfParticularlen(String st, int k) {

		int n = st.length();

		for (int s = 0; s <= (n - k); s++)
		{
			for (int e = s; e <= (s + k) - 1 ; e++) {
				System.out.print(st.charAt(e));
			}
			System.out.println();
		}

	}
	
	static void longestSubString(String s) {

		String res = "";

		for (int i = 0; i < s.length(); i++) {

			String temp = "";
			for (int j = i; j < s.length(); j++) {

				if (temp.indexOf(s.charAt(j)) == -1) 
				{
					temp = temp + s.charAt(j);
				} else
					break;
			}

			if (temp.length() > res.length()) {
				res = temp;
			}

		}System.out.println(res);
	}
	
	static int countNoOfChar( String s, int n ) {
		int count1 = 0;
		for (int i=0; i<s.length();i++) {
			if (s.charAt(i)== 'a') 
				count1 ++ ;
		}
		int count2 = 0 ;
		for(int i=0; i< s.length() % n; i++) {
			
			if (s.charAt(i)== 'a') 
				count2 ++ ;
		}
		
		int finalCOunt = count1 + count2 + (n/s.length());
		return finalCOunt;
		
	}
	
	static void checkAnagramPalaindrom( String s ) {
		int i =0 ;
		int errorCount = 0;
		char [] c = s.toCharArray();	
		Arrays.sort(c);
		
		while (i<c.length) 		 {
			
			if ( i < c.length-1 && c[i] == c[i+1]) 
			{
				i = i+2 ;
			}else 
			{
				errorCount++ ;
				i=i+1 ;
			}
		}
		
		if(errorCount <=1) 
			System.out.println("YES");
		
		else 
			System.out.println("NO");
		
	}
	
	static boolean checkTwoStringAreAnagram(String s1, String s2) {

		String s1_new = "";
		String s2_new = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				s1_new = (s1_new + s1.charAt(i)).toLowerCase();
			}
		}

		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) != ' ') {
				s2_new = (s2_new + s2.charAt(i)).toLowerCase();
			}
		}

		char[] s1_c = s1_new.toCharArray();
		char[] s2_c = s2_new.toCharArray();

		Arrays.sort(s1_c);
		Arrays.sort(s2_c);

		 s1 = new String(s1_c);
		s2 = new String(s2_c);

		if (s1.equals(s2))
			return true;

		else
			return false;

	}

	
	static void pangramCheck(String s) {
		// Pangram has all 26 alphabets in the String

	    String alphabets = "abcdefghijklmnopqrstuvwxyz";
		int count = 0;
		s= s.toLowerCase();
		for (int i = 0; i < alphabets.length(); i++)
		{
			if (s.indexOf(alphabets.charAt(i)) != -1) {
				count++;
			}

		}
		System.out.println(count);

		if (count == 26)
			System.out.println("It is a Pangram");

		else
			System.out.println("No it is not a Pangram");

	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Substring");
//		String s1 = scan.nextLine();
//		String s2 = scan.nextLine();
		String st = scan.nextLine();
//		int k = scan.nextInt();
//		subStrings(st);
//		subStringsOfParticularlen(st, k);
//		longestSubString(st);
//		System.out.println(countNoOfChar(st, k));
//		checkAnagramPalaindrom(st);
//		System.out.println(checkTwoStringAreAnagram(s1, s2));
		pangramCheck(st);
		
		}
	
}
