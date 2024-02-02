package programs;

public class String_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "JAVA";
		String s2 = "PYTHON";

		String s3 = "JAVA" + "PYTHON" ; 
		String s4 = "JAVA" + "PYTHON" ; 
		
		if (s3 == s4 ) 
		{
			System.out.println("Reference are same  ");
		} else
		
		{
			System.out.println("Reference are same different ");
		}  // Returns True
		
		
		if (s3.equals(s4))
		{
			System.out.println("\"Value are same ");
			
		} else
		
		{
			System.out.println("Value are  different");
		}  // Returns False
		
		
		// Ignore case sensitivity 
		if(s3.equalsIgnoreCase(s4 )) {
			System.out.println("Value are same ");
			
		} else
		
		{
			System.out.println("Value are different");
		}  // Returns TRue 
		
	}

}
