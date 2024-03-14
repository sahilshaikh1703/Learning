package programs;

public class BinarySearch {

	static int keyCheck(int[] a, int key) {

		int l = 0;
		int h = a.length - 1;
		int mid = 0;

		while (l <= h) {

			mid = (l + h) / 2;

			if (key == a[mid]) {
				return mid;
			} else if (key > a[mid]) {

				l = mid + 1;

			} else if (key < a[mid]) {
				h = mid - 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		int k = 10;
		System.out.println(keyCheck(a, k));

	}

}
