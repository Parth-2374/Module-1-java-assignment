package otherpackage;

import mypackage.MyClass;

public class DifferentPackageDemo {
	public static void main(String[] args) {
		 MyClass m2 = new MyClass();
		 m2.publicMethod();
//		 m2.protectedMethod();
//		 m2.defaultMethod();
//		 m2.privateMethod();
	}
}
