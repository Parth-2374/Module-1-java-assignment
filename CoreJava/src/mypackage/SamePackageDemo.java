package mypackage;

public class SamePackageDemo {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		m1.publicMethod();
		m1.protectedMethod();
		m1.defaultMethod();
		m1.privateMethod();
	}
}
