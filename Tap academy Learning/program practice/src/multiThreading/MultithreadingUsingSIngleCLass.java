package multiThreading;

import java.util.Scanner;

class threadCalss extends Thread {

	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		if (name.equals("add")) {
			addition();
		}else if (name.equals("char")){
			printAlpha();
		}else {
			printNum();
		}
		
	}

	void addition() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number ");
		int a = scan.nextInt();
		System.out.println("Enter the second Number ");
		int b = scan.nextInt();
		System.out.println("The addition of the number is " + a + b);

	}

	void printAlpha() 
	{

		System.out.println("The alphabets are as follow :");
		for (int i = 65; i <= 76; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	void printNum() {

		System.out.println("The numbers are as follow ");
		for (int i = 0; i <= 10; i++) {
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

public class MultithreadingUsingSIngleCLass {

	public static void main(String[] args) {

		threadCalss t1 = new threadCalss();
		threadCalss t2 = new threadCalss();
		threadCalss t3 = new threadCalss();
		
		t1.setName("add");
		t2.setName("char");
		t3.setName("num");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
