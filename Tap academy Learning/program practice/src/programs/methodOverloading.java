package programs;

public class methodOverloading {
	char gender;
	String city;
	int CID;
	long mobileNum;

	void setDetails(char g) {
		gender = g;
	}

	void setDetails(String c) {
		city = c;
	}

	void setDetails(int id) {
		CID = id;
	}

	void setDetails(long n) {
		mobileNum = n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodOverloading c1 = new methodOverloading();
		
		c1.gender = 'm';
		c1.city = "indore";
		c1.CID = 234;
		c1.mobileNum = 12345678;

		System.out.println(c1.gender);
		System.out.println(c1.city);
		System.out.println(c1.CID);
		System.out.println(c1.mobileNum);

		c1.setDetails('f');
		c1.setDetails("Bhopal");
		c1.setDetails(1323);
		c1.setDetails(988743450);

		System.out.println(c1.gender);
		System.out.println(c1.city);
		System.out.println(c1.CID);
		System.out.println(c1.mobileNum);
	}

}
