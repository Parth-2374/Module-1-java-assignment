package ConstructorsandDestructors;

	class Box{
		String sname;
		int age;
		
	Box(String s,int a){
		sname=s;
		age=a;
	 }
	void display() {
		System.out.println("Name:- "+sname);
		System.out.println("Age:- "+age);
	}
}
public class ParameterizedConstructor {
	public static void main(String[] args) {
		Box b1=new Box("parth",20);
		b1.display();
	}
}
