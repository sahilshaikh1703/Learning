package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		
		String path = "E:\\testFiles\\data.txt";
		File file = new File(path);
		
//		System.out.println("Create new file " + file.createNewFile(); 
		
		System.out.println("can read " + file.canRead());
		System.out.println("Can write " + file.canWrite());
		System.out.println("File exisit " + file.exists());

		/*  Create new Director 
		String path2 = "E:\\testFiles\\java";
		File file2 = new File(path2);
		file2.mkdir();   */
		System.out.println("get abosulte path  " + file.getAbsoluteFile());
		System.out.println("Get Name of the file " + file.getName());
		System.out.println("Get the parent foleder " + file.getParent());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getTotalSpace());
	}

}
