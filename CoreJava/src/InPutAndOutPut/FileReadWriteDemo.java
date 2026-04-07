package InPutAndOutPut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new FileReader("first.txt"));
		FileWriter fw = new FileWriter("output.txt");
		String s;
		while((s=br.readLine())!=null) {
			fw.write(s + "\n");
		}
		br.close();
		fw.close();
		System.out.println("Data copied from First.txt to output.txt");
	}
}
