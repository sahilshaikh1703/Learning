package exceptionHandling;

import java.util.Scanner;

class exceptionHandling1 {
	
	void fun1() {
		
		System.out.println("Connection 1 started ");
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter value of a :");
		int a = scan.nextInt();
		System.out.println("Enter value of b :");
		int b = scan.nextInt();
		System.out.println("a/b is " + a/b);
		System.out.println("Connection 1 terminated ");	
		
	}
}

class exceptionHandling2  {
	
	void fun2() throws Exception{
		System.out.println("Connection 2 started ");
		try {
		exceptionHandling1 c1 = new exceptionHandling1();
		c1.fun1();
		} 
		catch(Exception e) {
			System.out.println("Exception handled inside fun2");
			throw e;
		}
	
		System.out.println("Connection 2 terminated ");
		
		}
}

class exceptionHandling3 {
	
	void fun3() {
		System.out.println("Connection 3 started ");
		
		exceptionHandling2 c2 = new exceptionHandling2();
		try {c2.fun2();}
		catch (Exception e ) 
		{
			System.out.println("Exception handled inside fun3");
		}
		System.out.println("Connection 3 terminated");
	}
}



public class ExceptionHandlin {

	
	
	public static void main(String[] args) {
		System.out.println("Connection 4 started ");
		exceptionHandling3 c3 = new exceptionHandling3();
		c3.fun3();
		System.out.println("Connection 4 terminated ");
	}

}
