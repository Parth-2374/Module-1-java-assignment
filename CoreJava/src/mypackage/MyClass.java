package mypackage;

public class MyClass {
	public void publicMethod() {
		System.out.println("Public Method");
	}
	protected void protectedMethod() {
		System.out.println("Protected Method");
	}
	void defaultMethod() {
		System.out.println("Default Method");
	}
	void privateMethod() {
		System.out.println("Private Method");
	}
	public void accessPrivate() {
		privateMethod();
	}
}
