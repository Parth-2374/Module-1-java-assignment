package Methods;

public class Overloading {
	int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

	public static void main(String[] args) {
		Overloading or =new Overloading();
		 System.out.println("Int Addition: " + or.add(5, 3));
	     System.out.println("Double Addition: " + or.add(2.5, 3.5));
	}
}
