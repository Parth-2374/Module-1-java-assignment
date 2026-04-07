package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("Apple");
		a.add("Banana");
		a.add("mango");	
		System.out.println("ArrayList.");
		for(String s : a) {
			System.out.println(s);
		}
		LinkedList<String>l=new LinkedList<String>();
		l.add("Car");
		l.add("Bike");
		l.add("Bus");
		System.out.println("LinkedList.");
		for(String s : l) {
			System.out.println(s);
		}
	}
	
}
