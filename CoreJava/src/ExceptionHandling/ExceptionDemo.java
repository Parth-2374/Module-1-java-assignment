package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start Code");
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Your A :- ");
			a=sc.nextInt();
			System.out.print("Enter Your B :- ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division :- "+c);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero : "+e);
		}finally {
			System.out.println("Finally block always executes ");
		}
		System.out.println("End Code");
	}
}
