package programs;

import java.util.Scanner;

public class insertionSort {

	
	
	static void insertion(int [] a ) {
		
		// i always starts from 1 and j is always behind i 
		for (int i= 1 ; i< a.length ; i++  ) {
			int key = a[i];
			int j = i-1;
			
			while(j>=0 && a[j] > key ) {
				a[j+1] = a[j];
				j--;
			} 
			 System.out.println("Value of j " + j);
			a[j+1] = key;
			
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scan.nextInt();

        // Input array
        int[] a = new int[n];

        System.out.println("Enter the elements:");

        // Input the elements into the array
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        // Call insertion function to sort the array
        insertion(a);

        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
	}
	}
}
