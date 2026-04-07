package com.Methods;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your A:- ");
		a=sc.nextInt();
		System.out.print("Enter Your B:- ");
		b=sc.nextInt();
		System.out.print("Enter Your C:- ");
		c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("A IS MAX");
			}else {
				System.out.println("C IS MAX");
			}
		}else if(b>c) {
			System.out.println("B IS MAX");
		}else {
			System.out.println("C IS MAX");
		}
	}
}
