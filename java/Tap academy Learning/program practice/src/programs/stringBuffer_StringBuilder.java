package programs;

public class stringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer st = new StringBuffer();
		StringBuilder st1 = new StringBuilder();  // Same Functionality 
		
		System.out.println(st.capacity());
						
		System.out.println(st1.capacity());   // By Default 16 bit is assigned 
		
		
		st.append("Jvav");
		st.append("JAVA");	
		st.append(" JAVASCRIPT");
		
		System.out.println(st.length());
		System.out.println(st.capacity());
		
		
		
		
		
		st.append(" Hello World" ); 
		System.out.println(st.capacity());   // The size automatically increased by currentSize * 2 + 2 
		
		// Number of character in the string 
		System.out.println(st.length());
		
		// Remove the un used memory 
		st.trimToSize();
		System.out.println(st.capacity());  
		
		// Delete the character from the string 
		st.delete(0, 5);
		System.out.println(st);


	}

}
