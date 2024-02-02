package programs;

class customerTest23 {
	private String name;
	private int cid;
	private long cnumber;

	/* Defining constructor : Is a type setter 
	* 1. Should public i.e accessible to all 
	* 2. Should not have a return type 
	* 3. Same name is that of class 
	* 4. Call at the time of object creation 
	*
	*/
	public customerTest23(String name, int cid, long cnumber)

	{
		this.name = name;
		this.cid = cid;
		this.cnumber = cnumber;
	}
	
	public customerTest23 () {
		name = "Default Constructor";
		cid = 1000;
		cnumber = 92848534;
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

public class constructor_Check {

	public static void main(String[] args) {

		customerTest23 c1 = new customerTest23("Sahil", 002, 978656565);
		System.out.println(c1.getName() + " " + c1.getCID() + " " + c1.getNumber());
		
		customerTest23 c2 = new customerTest23();
		System.out.println(c2.getName() + " " + c2.getCID() + " " + c2.getNumber());
	}
}
