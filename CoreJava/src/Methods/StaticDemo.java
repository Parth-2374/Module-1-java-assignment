package Methods;

public class StaticDemo {
	static int count = 0;
    StaticDemo() {
        count++;
    }
    static void showCount() {
        System.out.println("Objects created: " + count);
    }
    public static void main(String[] args) {
    	StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
        StaticDemo s3 = new StaticDemo();
        StaticDemo s4 = new StaticDemo();      

        StaticDemo.showCount();
	}

}
