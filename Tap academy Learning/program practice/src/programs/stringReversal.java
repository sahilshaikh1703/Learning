package programs;

import java.util.Scanner;

public class stringReversal {
	
	static String reverse(String s) {
		
		String t = "";
		
		for(int i=s.length()-1 ; i>=0;i--) {
			
			t = t + s.charAt(i);
		}
		return t; 
	}

	static String reverseUsingWhile(String s) {
		char[] c = s.toCharArray();
		int i = 0;
		int j = c.length-1 ;
	
		while(i <=j) 
		{
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		
		return new String(c);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = scan.nextLine();
//		System.out.println(reverse(s));
		System.out.println(reverseUsingWhile(s));
		
	}

}
