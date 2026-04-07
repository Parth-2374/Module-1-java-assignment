package CollectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	ArrayList<Integer>i=new ArrayList<Integer>();
	i.add(10);
	i.add(20);
	i.add(10);
	i.add(30);
	i.add(20);
	
	System.out.println("Original List."+i);
	HashSet<Integer>set=new HashSet<Integer>(i);
	System.out.println("After removing duplicates."+set);
	
}
}
