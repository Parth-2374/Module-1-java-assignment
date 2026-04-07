package InheritanceandPolymorphism;

import java.util.Scanner;

class A{
		int a;
		void getA() {
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter Your A:-");
			a=sc.nextInt();
		}
		void putA() {
			System.out.println("A :- "+a);
		}
	}
class B extends A{
	int b;
	void getB() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your B:-");
		b=sc.nextInt();
	}
	void putB() {
		System.out.println("B :- "+b);
	}
}
public class Inheritance {
public static void main(String[] args) {
	B b1 = new B();
	b1.getA();
	b1.getB();
	
	b1.putA();
	b1.putB();
}
}
