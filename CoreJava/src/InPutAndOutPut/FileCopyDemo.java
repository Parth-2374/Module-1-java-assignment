package InPutAndOutPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("first.txt");
		FileOutputStream fos =new FileOutputStream("first.txt");
		int i;
		while((i=fis.read())!=-1) {
			fos.write(i);
		}
		
		fis.close();
		fos.close();
		System.out.println("File copied successfully!");
	}
}
