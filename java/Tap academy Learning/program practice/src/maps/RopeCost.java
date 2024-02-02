package maps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class RopeCost {

	public static void main(String[] args) {
		System.out.println("Enter the Number of ropes");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		PriorityQueue<Integer> ropes = new PriorityQueue<Integer>();
		for (int i =0;i<n;i++) {
			int length = scan.nextInt();
			ropes.add(length);
		}
		
		int sum , totalCost=0;
		
		while(ropes.size()>1) {
			int  r1 = ropes.poll();
			int r2 = ropes.poll();

			sum = r1 + r2 ;
			totalCost += sum;
			
			ropes.add(sum);
		}
		System.out.println(totalCost);
	}
	

}
