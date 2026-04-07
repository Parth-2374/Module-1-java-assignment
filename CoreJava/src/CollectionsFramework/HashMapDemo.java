package CollectionsFramework;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> m=new HashMap<Integer, String>();
	m.put(1,"Amit");
	m.put(2,"Rahul");
	m.put(3,"Payal");
	System.out.println("HashMap."+m);
	System.out.println("Value for key 2."+m.get(2));
	if(m.containsKey(4)) {
		System.out.println("Key Exists.");
	}else {
		System.out.println("Key Not Exists.");
	}
	
}
}
