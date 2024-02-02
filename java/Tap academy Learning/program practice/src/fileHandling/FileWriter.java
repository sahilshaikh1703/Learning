package fileHandling;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriter {

	public static void main(String[] args) throws IOException {

		String path = "E:\\testFiles\\java\\data.txt";
		File file = new File(path);
		Scanner scan = new Scanner(System.in);
		java.io.FileWriter writer = new java.io.FileWriter(file, true);



		try {
			// Mentioning true in the parameter will append the content 
			
			writer.write("Hellow world");
						String s1 = scan.nextLine();
			String s2 = scan.nextLine();
			writer.write(s1 + s2);
			
			writer.flush();   // put the content in the file 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		scan.close();
		writer.close();
	}	
	

}
