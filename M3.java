package filehandling;

import java.io.File;
import java.io.IOException;

public class M3 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("text2");
		File f2  = new File(f1, "test3.txt"); // creating a file inside f1 directory.
		File f3 = new File("D:\\dev-june\\app1\\src", "test4.txt"); //creating file using absolute path
		f1.mkdir();  // creating a directory
		f2.createNewFile();
		f3.createNewFile();
		System.out.println(f1.isDirectory()); // to check if it is a directory
		boolean b1 = f1.exists(); 
		System.out.println(b1);
		boolean b2 = f2.isFile();// to check if it is file
		System.out.println(b2);
		System.out.println("done");
		}
}
