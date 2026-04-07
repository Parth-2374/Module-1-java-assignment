package InterfacesandAbstractClasses;
	 
  abstract class A{
	   abstract void show();
	   void display() {
		   System.out.println("A Is Display");
	   }
   }
  class B extends A{
	  void show() {
		  System.out.println("B IS Show");
	  }
  }
public class Abstract {
	public static void main(String[] args) {
		B b1 = new B();
		b1.display();
		b1.show();
	}
}
