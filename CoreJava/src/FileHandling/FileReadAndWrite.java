package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {
	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("first.txt");
		String s="This Is First File.";
		fw.write(s);
		fw.flush();
		fw.close();
		
		System.out.println("File Writer Successfully");
		
		FileReader fr =new FileReader("first.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}
}
