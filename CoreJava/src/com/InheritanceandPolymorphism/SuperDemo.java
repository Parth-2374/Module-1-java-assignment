package com.InheritanceandPolymorphism;
class P{
	public P() {
		System.out.println("P Constructor Called");
	}
	void display() {
		System.out.println("P Class Method");
	}
}
class Q extends P{
	public Q() {
		System.out.println("Q Constructor Called");
	}
	void display() {
		super.display();
		System.out.println("Q Class Method");
	}
}

public class SuperDemo {
public static void main(String[] args) {
	Q q1 =new Q();
	q1.display();
}
}
