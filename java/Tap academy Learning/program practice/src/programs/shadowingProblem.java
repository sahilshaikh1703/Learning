package programs;

class customerCheck {
	private String name;
	private int cid;
	private long cnumber;

	public void setData(String name, int cid, long cnumber) 
	
	{
		/* This is SHADOWING PROBLEM where local and instance variable have same name 
		 
		name = name;
		cid = cid;
		cnumber = cnumber;
		
		To resolve shadowing problem use this 	 */
	
		this.name = name;
		this.cid = cid;
		this.cnumber = cnumber;
	}


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


public class shadowingProblem {

	public static void main(String[] args) {

		customerTest23 c1 = new customerTest23();
		c1.setData("Sahil", 002, 978656565);
		System.out.println(c1.getName()+ " " + c1.getCID() + " " + c1.getNumber());
	}

}
