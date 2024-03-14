package programs;

import java.util.Scanner;

public class selectionSort {

	static void selection(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {

			int min_i = i;

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[min_i]) {
					min_i = j;

				}
			}
			int temp = a[i];
			a[i] = a[min_i];
			a[min_i] = temp;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
        	selection(a);
        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
	}
	}
}
