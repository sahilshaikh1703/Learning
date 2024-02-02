package exceptionHandling;

class Family implements Runnable {
	String resource1 = "TV";
	String resource2 = "PLAY STAION";

	public void run() {
		String name = Thread.currentThread().getName();
		
		if (name == "SON") {
			SonAquired();
		} else {
			daughterAquired();

		}
	}

	// Deadlock Situation
	public void SonAquired() {

		synchronized (resource2) {
			try {

				System.out.println("Son aquired resource 1 ");
				Thread.sleep(3000);
				synchronized (resource1) {
					System.out.println("Son aquired resource 2 ");
					Thread.sleep(3000);
				}

			} catch (Exception e) {
			}
		}
	}

	/*
	 * Solution public void SonAquired() {
	 * 
	 * synchronized (resource1) { try {
	 * 
	 * System.out.println("Son aquired resource 1 "); Thread.sleep(3000);
	 * synchronized (resource2) { System.out.println("Son aquired resource 2 ");
	 * Thread.sleep(3000); }
	 * 
	 * } catch (Exception e) { } }
	 * 
	 * }
	 */

	public void daughterAquired() {

		synchronized (resource1) {
			try {

				System.out.println("Daughter aquired resource 1 ");
				Thread.sleep(3000);
				synchronized (resource2) {
					System.out.println("Daughter aquired resource 2 ");
					Thread.sleep(3000);
				}

			} catch (Exception e) {
			}
		}

	}

}

public class Deadlock {

	public static void main(String[] args) {

		Family f = new Family();

		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f);

		t1.setName("SON");
		t2.setName("DAUGHTER");
		
		t1.start();
		t2.start();
	}

}
