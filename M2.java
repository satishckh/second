package filehandling;


import java.io.File;
import java.io.IOException;

public class M2 {
public static void main(String[] args) throws IOException {
	File f1 = new File("text1.txt");
	boolean b1 = f1.createNewFile();
		boolean b2 = f1.createNewFile();
	System.out.println(b2);
	System.out.println("done");
	public static void main(String[] args) throws IOException {
	File f1 = new File("text1.txt");
	boolean b1 = f1.createNewFile();
		boolean b2 = f1.createNewFile();
	System.out.println(b2);
	System.out.println("done");

	System.out.println(b1);
	boolean b2 = f1.createNewFile();
	System.out.println(b2);
	System.out.println("done");

	}
}
