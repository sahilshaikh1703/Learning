package codingProgramms;

public class PatternMaking_1 {

	public static void main(String[] args) {

		int n = 5;
		int ch = 'A';

		for (int i = 1; i <= n; i++) {
			System.out.println();
			if (i == 1 || i == 3 || i == 5) {

				for (int j = 1; j <= i; j++) {
					System.out.print((char) ch++);
				}
			} else {
				ch = ch + i - 1;
				for (int j = 1; j <= i; j++) {

					System.out.print((char) ch--);
				}
				ch = ch + i + 1;
			}
		}
	}
}
