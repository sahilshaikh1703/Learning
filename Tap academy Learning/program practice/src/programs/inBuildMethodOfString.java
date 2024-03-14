package programs;

public class inBuildMethodOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String s = "SachiNS";
			char c[] = {'a' , 'B' , 'c' , '1' ,'r' , ' '};
			
			// Convert to upper class 
			System.out.println(s.toUpperCase());
					
			
			// Convert to lower case
			System.out.println(s.toLowerCase());
			
			// Check index of 
			System.out.println(s.indexOf('c'));
			
			//CHeck Index at last 
			System.out.println(s.lastIndexOf('S'));
			
			//Check start character , it expects "" as String can be given qs input 
			System.err.println(s.startsWith("S"));
			System.err.println(s.startsWith("Sac"));
			
			// Ends with character  
			System.err.println(s.endsWith("S"));
			
			//Contains check
			System.out.println(s.contains("ach"));
			
			// substring  
			// Start is inclusive and end is exclusive
			System.out.println(s.substring(2));
			System.out.println(s.substring(2, 6)); 
			
			System.out.println(Character.isDigit(c[3]));
			
			
	}
	
	

}
