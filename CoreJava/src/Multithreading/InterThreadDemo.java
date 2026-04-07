package Multithreading;
	class shared{
		int data;
		boolean flag=false;
		 synchronized void produce(int value) throws InterruptedException {
			 while(flag) {
				 wait();
			 }
			 data=value;
			 System.out.println("Produced :- "+data);
			 flag=true;
			 notify();
		 }
		 synchronized void consume() throws InterruptedException {
			 while(!flag) {
				 wait();
			 }
			 System.out.println("Consumed :-"+data);
			 flag=false;
			 notify();
		 }
	}
public class InterThreadDemo {
	public static void main(String[] args) {
		shared s= new shared();
		Thread producer =new Thread(()->{
			try {
				for(int i=1;i<=5;i++) {
					s.produce(i);
				}
			}catch(InterruptedException e) { }
		});
		Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    s.consume();
                }
            } catch (InterruptedException e) {}
        });
		producer.start();
		consumer.start();
	}
}
