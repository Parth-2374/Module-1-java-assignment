package ExceptionHandling;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		try {
				int a[] = new int[3];
				a[5]=10;
				int x=10/0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred");
		}catch(Exception e) {
			System.out.println("General Exception");
		}
	}
}
