package multiThreading;

import java.util.Scanner;

class runnable1 implements Runnable {
	
	public void run() {
		
	Scanner scan = 	new Scanner(System.in);
	System.out.println("Enter the first Number ");
	int a = scan.nextInt();
	System.out.println("Enter the second Number ");
	int b = scan.nextInt();
	System.out.println("The addition of the number is " + a+b);
	
	}
}


class runnable2 implements Runnable {
	public void run() {
		System.out.println("The alphabets are as follow :");
		for(int i=65 ; i<=76 ; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class runnable3 implements Runnable {
	public void run() {
		System.out.println("The numbers are as follow ");
		for (int i = 0 ; i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
public class MultiThreadingUsingRunnable {

	public static void main(String[] args) {

		runnable1	t1 = new runnable1();
		runnable2	t2 = new runnable2();
		runnable3	t3 = new runnable3();
		
		
	Thread	th1 = new Thread(t1);
	Thread	th2 = new Thread(t2);
	Thread	th3 = new Thread(t3);
	
	th1.start();
	th2.start();
	th3.start();
	
	
	
	}

}
