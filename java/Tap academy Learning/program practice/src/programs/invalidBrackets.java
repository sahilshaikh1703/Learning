package programs;

import java.util.Scanner;

public class invalidBrackets {

	static String bracketCheck(String s )  
	{
		int count =0;
		int bracket = 0;
		
		for (int i=0; i <s.length(); i++)
		{
			if(s.charAt(i) == '(')
			{
				bracket ++ ; 
			}else 
			{
				if (bracket <=0 ) 
				{
					count++ ;
					
				}else {
					bracket-- ;
				}
			}
		}
		System.out.println(count);
		System.out.println(bracket);
		if (count !=0 && bracket != 0)
			return "Brackets are Inavalid";
		
		else 
			return "Bracket are valid ";
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = scan.nextLine();
		
System.out.println(bracketCheck(s));
	}

}
