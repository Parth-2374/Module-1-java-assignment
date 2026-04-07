package Oops;
class F1{
	void show(){
		System.out.println("Show F1");
	}
}
class F2 extends F1{
	void show() {
		super.show();
		System.out.println("Show F2");
	}
}
class F3 extends F2{
	void show() {
		super.show();
		System.out.println("Show F3");
	}
}
public class OverridingDemo {
	public static void main(String[] args) {
		F3 f3 = new F3();
		f3.show();
	}
}
