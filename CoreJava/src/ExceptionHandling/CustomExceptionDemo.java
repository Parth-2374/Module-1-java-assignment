package ExceptionHandling;

 class MyException extends Exception{
	 MyException(String s){
		 super(s);
	 }
 }
public class CustomExceptionDemo {
	static void checkage(int age) throws MyException{
		if(age<18) {
			throw new MyException("Not eligible to vote");
		}else {
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args) {
		try {
			checkage(15);
		}catch(Exception e) {
			System.out.println("Exception :- "+e.getMessage());
		}
	}
	
}
