package com.InterfacesandAbstractClasses;
	interface Payment{
		void pay(double amount);
	}
	class CreditCardPayment implements Payment{
		public void pay(double amount) {
			System.out.println("Paid :- "+amount+" Using Credit Card");
		}
	}
	class UpiPayment implements Payment{
		public void pay(double amount) {
			System.out.println("Paid :- "+amount+" Using UPI ");
		}
	}
public class PaymentDemo {
	public static void main(String[] args) {
		Payment p;
		 p = new CreditCardPayment();
		 p.pay(1000);
		 
		 p = new UpiPayment();
		 p.pay(500);
	}
}
