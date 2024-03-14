package programs;

class customer {
	 private String name;
	private int cid;
	private long cnumber;

	public void setData(String customer_name, int customer_ID, long customer_number) 
	
	{
		name = customer_name;
		cid = customer_ID;
		cnumber = customer_number;
	}
	
	/*
	 * public void setData1(String customer_name, int customer_ID, long
	 * customer_number) { name = customer_name; cid = customer_ID; cnumber =
	 * customer_number;
	 * 
	 * }
	 */

	public int getCID() {
		return cid;
	}

	public String getName() {
		return name;
	}

	public long getNumber() {
		return cnumber;
	}
}

public class enCapsulationFoodOrderdring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c1 = new customer();		
		customer c2 = new customer();
		c1.setData("Sahil", 002, 919283746);
//		c2.setData1("Sasdshil", 002, 232283746);
		System.out.println(c1.getCID() + " " + c1.getName() + " " + c1.getNumber());
//		System.out.println(c2.getCID() + " " + c2.getName() + " " + c2.getNumber());

	}

}
