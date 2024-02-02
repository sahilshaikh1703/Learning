package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// Goto FileobjectInputOutputStreamm class  file to check the response 
class Customer implements Serializable {
	
	private static final long serialVersionUID = 5699662799073981659L;
	
	private String name;
	private transient long accountNumber; // Does not print the value in the file  return 0.0
	private int balance;

	public Customer(String name, long accountNumber, int balance) {
		super();
		this.setName(name);
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

public class InputOutputStream {

	public static void main(String[] args) {
		String path = "E:\\testFiles\\FileoutInputputStream\\FileOutputStream.txt";
		Customer cus = new Customer("Sahil", 2534534667234l, 34456);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(cus);
			oos.flush();
		} catch (Exception e) {
		}

	}

}
