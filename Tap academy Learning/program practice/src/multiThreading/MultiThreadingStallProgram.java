package multiThreading;

import java.util.Scanner;

class Stalls implements Runnable {
	private String stallName;
	private String details;
	private double stallArea;
	private double stallCost;
	private String owner;

	Stalls() {

	}

	public Stalls(String stallName, String details, double stallArea, String owner) {
		this.stallName = stallName;
		this.details = details;
		this.stallArea = stallArea;
		this.owner = owner;
	}

	public void run() {
		stallCost = stallArea * 150;
	}

	public String getStallName() {
		return stallName;
	}

	public String getDetails() {
		return details;
	}

	public double getStallCost() {
		return stallCost;
	}

	public String getOwner() {
		return owner;
	}
}

public class MultiThreadingStallProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numer of Stalls ");
		int n = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < n; i++) {

			String s = scan.nextLine();
			String[] split = s.split(",");

			System.out.println(split[0]);
			Stalls[] stall = new Stalls[n];

			stall[i] = new Stalls(split[0], split[1], Integer.parseInt(split[2]), split[3]);

//			 new Stalls(split[0], split[1], split[2], s`plit[3]);
		}

		for (int i = 0; i < n; i++) {
			Thread t = new Thread(stall[]);
		}

	}

}
