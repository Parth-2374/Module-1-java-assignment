package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int rno;
	String snmame;
	public Student(int rno, String snmame) {
		this.rno = rno;
		this.snmame = snmame;
	}
	public String toString() {
		return "student [Roll No :- " + rno + ", Student Name :- " + snmame + "]";
	}
}
public class SerializationDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Student s1 =new Student(10, "Amit");
	FileOutputStream fos =new FileOutputStream("School");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s1);
	oos.flush();
	oos.close();
	System.out.println("File Writer Sucessfully");
	FileInputStream fis = new FileInputStream("School");
	ObjectInputStream ois =new ObjectInputStream(fis);
	Student s2 =(Student) ois.readObject();
	System.out.println(s2);
	ois.close();
}
}
