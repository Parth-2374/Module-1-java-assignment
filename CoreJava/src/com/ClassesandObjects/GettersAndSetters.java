package com.ClassesandObjects;

public class GettersAndSetters {
	private String name;
	private int age;
	 public void setName(String n) {
	        name = n;
	    }
	    public void setAge(int a) {
	        age = a;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }

	public static void main(String[] args) {
		GettersAndSetters gs=new GettersAndSetters();
		gs.setName("Rahul");
		gs.setAge(50);
		 System.out.println("Name: " + gs.getName());
	        System.out.println("Age: " + gs.getAge());
	}
}
