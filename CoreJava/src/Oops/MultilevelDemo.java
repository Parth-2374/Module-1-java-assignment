package Oops;

import java.util.Scanner;

class X{
	 int x;
	 void getX() {
		 Scanner sc =new Scanner(System.in);
		 System.out.print("Enter Your X:-");
		 x=sc.nextInt();
	 }
	 void putX() {
		 System.out.println("X:-"+x);
	 }
 }
 class Y extends X{
	 int y;
	 void getY() {
		 Scanner sc =new Scanner(System.in);
		 System.out.print("Enter Your Y:-");
		 y=sc.nextInt();
	 }
	 void putY() {
		 System.out.println("Y:-"+y);
	 }
 }
 class Z extends Y{
	 int z;
	 void getZ() {
		 Scanner sc =new Scanner(System.in);
		 System.out.print("Enter Your Z:-");
		 z=sc.nextInt();
	 }
	 void putZ() {
		 System.out.println("Z:-"+z);
	 }
 }
public class MultilevelDemo {
	public static void main(String[] args) {
		Z z1=new Z();
		z1.getX();
		z1.getY();
		z1.getZ();
		
		z1.putX();
		z1.putY();
		z1.putZ();
	}
}
