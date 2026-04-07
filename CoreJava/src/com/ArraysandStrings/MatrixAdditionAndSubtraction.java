package com.ArraysandStrings;

import java.util.Scanner;

public class MatrixAdditionAndSubtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		int sum[][]=new int [3][3];
		int sub[][]=new int [3][3];
		int i,j;
		System.out.println("Enter elements of Matrix A:");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.print("Enter ["+i+"] Row & ["+j+"] Cloumn:- ");
			  a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of Matrix B:");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.print("Enter ["+i+"] Row & ["+j+"] Cloumn:- ");
			  b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Matrix Addition:");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.println("Addition["+i+"]["+j+"] :- "+sum[i][j]);
			}
		}
		System.out.println("Matrix Subtraction:");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.println("Subtraction["+i+"]["+j+"] :- "+sub[i][j]);
			}
		}
	}
}
