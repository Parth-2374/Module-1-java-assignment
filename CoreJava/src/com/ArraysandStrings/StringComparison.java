package com.ArraysandStrings;

import java.util.Scanner;

public class StringComparison {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your First String :-");
		String s1=sc.next();
		System.out.print("Enter Your Second String :-");
		String s2=sc.next();
		if(s1.equals(s2)) {
			System.out.println("Strings are equal using equals ");
		}else {
			System.out.println("Strings are NOT equal using equals ");
		}
		int res=s1.compareTo(s2);
		if(res==0) {
			System.out.println("Strings are equal ");
		}else if(res>0) {
			System.out.println("First string is greater");
		}else {
			System.out.println("Second string is greater");
		}
	}
}
