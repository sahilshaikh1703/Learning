package programs;

import java.util.Scanner;

public class BubbleSorting {

    // Function to perform Bubble Sort on an array
    static int[] sorting(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
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

        // Call sorting function to sort the array
        a = sorting(a);

        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
