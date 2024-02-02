package fileHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) throws IOException {

		java.io.FileReader reader;

		String path = "E:\\testFiles\\java\\data.txt";
		char[] arr = new char[15];
		try {
			reader = new java.io.FileReader(path);
//			System.out.println((char)reader.read());  Prints only the character inside the file
			System.out.println(reader.read(arr));   // Store the read data inside the array
			System.out.println(arr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
