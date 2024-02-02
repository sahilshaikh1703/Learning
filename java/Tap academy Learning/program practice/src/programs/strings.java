package programs;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String s1 = "JAVA";
//		String s2 = "JAVA";
//		
//		// Reference are compared , Created under Constant Pool , duplicate  string will not be created . 
//		if (s1 == s2 ) 
//		{
//			System.out.println("Reference are same   ");
//		} else
//		
//		{
//			System.out.println("Reference are same  ");
//		}  // Returns True
//		
//		
//		if (s1.equals(s2))
//		{
//			System.out.println("Value are same  ");
//		} else
//		
//		{
//			System.out.println("Value are same different");
//		}  // Returns True
//		
		
		// Reference are compared , Created under  non Constant Pool , duplicate  string will be created  . 

		String s3 = "JAVA";
		String s4 = new String("JAVA");
		
		
		if (s3 == s4 ) 
		{
			System.out.println("Reference are same  ");
		} else
		
		{
			System.out.println("Reference are same different ");
		}  // Returns True
		
		
		if (s3.equals(s4))
		{
			System.out.println("Value are same ");
			
		} else
		
		{
			System.out.println("Value are same different");
		}  // Returns True
		
		System.out.println("Ignore Case ");
		
		String s5 = "JAVA";
		String s6 = "Java"; 
		
		
		if (s5 == s6 ) 
		{
			System.out.println("Reference are same  ");
		} else
		
		{
			System.out.println("Reference are same different ");
		}  // Returns True
		
		
		if (s5.equals(s6))
		{
			System.out.println("\"Value are same ");
			
		} else
		
		{
			System.out.println("Value are  different");
		}  // Returns False
		
		
		// Ignore case sensitivity 
		if(s5.equalsIgnoreCase(s6)) {
			System.out.println("Value are same ");
			
		} else
		
		{
			System.out.println("Value are different");
		}  // Returns TRue 
		
		
		
 	}

}
