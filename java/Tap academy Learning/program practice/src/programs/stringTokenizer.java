package programs;

import java.util.StringTokenizer;

public class stringTokenizer {

	public static void main(String[] args) {

		String s = "JAVA PYTHON SQL AI";
//		StringTokenizer st = new StringTokenizer(s); // Chop on bassis of space 
		StringTokenizer st = new StringTokenizer(s, "A"); // Split on basis of A
		

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
