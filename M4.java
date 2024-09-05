package filehandling;

import java.io.File;
import java.io.IOException;

public class M4 {

	public static void main(String[] args) throws IOException {

		File f1 = new File("src"); 
		File f2 = new File(f1, "test1.txt");
		
        f2.createNewFile();
        System.out.println(f2.getParent());
}
}