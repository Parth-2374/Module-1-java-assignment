package Multithreading;
	class Mythread extends Thread{
		public void run() {
			for(int i=0;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" - "+i);
			}
		}
	}
public class ThreadDemo {
	public static void main(String[] args) {
		Mythread m1 =new Mythread();
		Mythread m2 =new Mythread();
		
		m1.setName("Thread-1");
		m2.setName("Thread-2");
		
		m1.start();
		m2.start();
	}
}
