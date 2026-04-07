package InheritanceandPolymorphism;
class X{
	void show() {
		System.out.println("X Is Show");
	}
}
class Y extends X{
	@Override
	void show() {
		System.out.println("Y IS Show");
	}
}
class Z extends X{
	@Override
	void show() {
		System.out.println("Z Is Show");
	}
}
public class RuntimePolymorphism {
	public static void main(String[] args) {
		X x;
		x =new Y();
		x.show();
		x=new Z();
		x.show();
	}
}
