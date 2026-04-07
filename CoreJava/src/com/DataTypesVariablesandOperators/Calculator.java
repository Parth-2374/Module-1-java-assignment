package com.DataTypesVariablesandOperators;

import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
	int a,b;
	Scanner sc =new Scanner(System.in);
	
	System.out.print("Enter First Value:-");
	a=sc.nextInt();
	System.out.print("Enter Secoend Value:-");
	b=sc.nextInt();
	
	System.out.println("Addition:-"+(a+b));
	System.out.println("Subtraction:-"+(a-b));
	System.out.println("Multiplication:-"+(a*b));
	System.out.println("Division:-"+(a/b));
	
	System.out.println("a>b:- " +(a>b));
    System.out.println("a<b:- " +(a<b));
    System.out.println("a==b:- " +(a==b));
    System.out.println("a!=b:- " +(a!=b));
	
}
}
