package multiThreading;

import java.util.Scanner;

class thread1 extends Thread {
	
	public void run() {
		
	Scanner scan = 	new Scanner(System.in);
	System.out.println("Enter the first Number ");
	int a = scan.nextInt();
	System.out.println("Enter the second Number ");
	int b = scan.nextInt();
	System.out.println("The addition of the number is " + a+b);
	
	}
}


class thread2 extends Thread {
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


class thread3 extends Thread {
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
public class MultiThreadingUsingThread {

	public static void main(String[] args) {

	userThread	t1 = new userThread();
	daemonThread1	t2 = new daemonThread1();
	daemonThread2	t3 = new daemonThread2();
	
	t1.start();
	t2.start();
	t3.start();
	
	
	}

}
