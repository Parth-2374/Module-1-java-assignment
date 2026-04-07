package ArraysandStrings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.print("Enter Your String :- ");
		s=sc.next();
		
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r +=s.charAt(i);
		}
		System.out.println("Reversed String :- "+r);
		
		if(s.equalsIgnoreCase(r)) {
			System.out.println("It Is a Plindrome");
		}else {
			System.out.println("Not a Plindrome");
		}
	}
}
