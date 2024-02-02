package multiThreading;

import java.util.Scanner;

class Test_1 extends Thread {
	public void run() {
		try {
			System.out.println("The thread has started printing ");
			Thread.sleep(3000);
			System.out.println("The thread is prining ");
			Thread.sleep(3000);
			System.out.println("The thread is prining ");
			Thread t1= Thread.currentThread();
			t1.interrupt();
			System.out.println("ENter the number ");
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			Thread.sleep(3000);
			System.out.println("The thread is prining ");
			Thread.sleep(3000);
			System.out.println("The thread is prining ");
			
			System.out.println("The thread has completed ");
		} catch (Exception e) {
			System.out.println("The thread has been intrupted ");
		}
	}
}

public class InteruptAndJoin {

	public static void main(String[] args) {
		System.out.println("The main has started connection");
		Test_1 t = new Test_1();
		t.start();
		try {
			// the join make the main thread to wait for other thread to complete 
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("The main has ended has ended connection");

	}

}
