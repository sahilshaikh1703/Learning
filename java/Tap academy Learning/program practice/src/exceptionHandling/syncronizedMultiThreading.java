package exceptionHandling;

class syncronizedMethod implements Runnable {
	synchronized public void run() {
		String name = Thread.currentThread().getName();
		try {
			System.out.println(name + " is accessing 1st line ");
			Thread.sleep(2000);
			System.out.println(name + " is accessing 2nd line ");
			Thread.sleep(2000);
			System.out.println(name + " is accessing 3rd line ");
			Thread.sleep(2000);
			System.out.println(name + " is accessing 4th line ");
			Thread.sleep(2000);
			System.out.println(name + " is accessing 5th line ");
			Thread.sleep(2000);
			System.out.println(name + " is accessing 6th line ");
			Thread.sleep(2000);
			System.out.println(name + " is accessing 7th line ");
			Thread.sleep(2000);
		} catch (Exception e) {
		}

	}

}

class syncronizedBlock implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		try {
			System.out.println(name + " is accessing 1st line ");
			Thread.sleep(2000);
			System.out.println(name + " is accessing 2nd line ");
			Thread.sleep(2000);
			System.out.println(name + " is accessing 3rd line ");
			Thread.sleep(2000);
			synchronized (this) {
				System.out.println(name + " is accessing 4th line ");
				Thread.sleep(2000);
				System.out.println(name + " is accessing 5th line ");
				Thread.sleep(2000);
				System.out.println(name + " is accessing 6th line ");
				Thread.sleep(2000);
			}

			System.out.println(name + " is accessing 7th line ");
			Thread.sleep(2000);
		} catch (Exception e) {
		}

	}

}

public class syncronizedMultiThreading {

	public static void main(String[] args) {
//		syncronizedMethod p = new syncronizedMethod();   Schncronished complete method statement 

		syncronizedBlock p = new syncronizedBlock();

		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);

		t1.setName("Person_1 ");
		t1.setName("Person_2 ");
		t1.setName("Person_3 ");

		t1.start();
		t2.start();
		t3.start();

	}

}
