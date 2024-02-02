package programs;

class bankAccount {
	private int accountID =1;

	public void setData(int ID) {
		if (accountID >= 1)
		{
			accountID = ID;
		} else 
		{
			System.out.println("Invalid Data");
			System.exit(0);
		}
	}

	
	public int getData() 
	{
		return accountID;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bankAccount b = new bankAccount();

		b.setData(123);
		System.out.println(b.getData());

	}

}
