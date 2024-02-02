package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileObjectInputStream {

	public static void main(String[] args) {
		String path = "E:\\testFiles\\FileoutInputputStream\\FileOutputStream.txt";

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {

			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			Customer customer = (Customer) ois.readObject();
			System.out.println();
			System.out.println(customer.getAccountNumber());
			System.out.println(customer.getBalance());
			System.out.println(customer.getName());
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
	}

}
