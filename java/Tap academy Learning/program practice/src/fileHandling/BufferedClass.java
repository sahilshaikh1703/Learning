package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedClass {
	
	// Reading data from 2 different files and writing into another files 

	public static void main(String[] args) throws IOException {

		String path1 = "E:\\testFiles\\New folder\\names.txt";
		String path2 = "E:\\testFiles\\New folder\\phoneNumber.txt";
		String path3 = "E:\\testFiles\\New folder\\phoneBook.txt";

		FileReader fr1 = null;
		FileReader fr2 = null;
		BufferedReader bf1 = null;
		BufferedReader bf2 = null;
		java.io.FileWriter writer = null;
		

		try {

			fr1 = new FileReader(path1);
			fr2 = new FileReader(path2);
			bf1 = new BufferedReader(fr1);
			bf2 = new BufferedReader(fr2);
			writer = new java.io.FileWriter(path3);
			
			
			String name = bf1.readLine();
			String phoneNumber = bf2.readLine();

			while (name != null) {
				writer.write(name + " : " + phoneNumber + "\n");

				name = bf1.readLine();
				phoneNumber = bf2.readLine();

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		writer.flush();
	}

}
