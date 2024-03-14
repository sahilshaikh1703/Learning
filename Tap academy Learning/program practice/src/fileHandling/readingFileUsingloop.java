package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class readingFileUsingloop {

	public static void main(String[] args) {

		String path = "E:\\testFiles\\java\\testfile.txt";
		String path2 = "E:\\testFiles\\java\\newData.txt";
		FileReader reader;
		FileWriter writer;

		try {
			reader = new FileReader(path);
			writer = new FileWriter(path2);
			int c = reader.read();
			System.out.println(c);
			while(c != -1) {
				System.out.print((char)c);
				writer.write(c);
				c = reader.read();
		
				}
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
