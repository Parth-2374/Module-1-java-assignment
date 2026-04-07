package com.InterfacesandAbstractClasses;
	interface I{
		void showI();
	}
	interface J{
		void showJ();
	}
	class demo implements I,J{
		public void showI() {
			System.out.println("Interface I Method");
		}
		public void showJ() {
			System.out.println("Interface J Method");
		}
	}
public class MultipleInterface {
	public static void main(String[] args) {
		demo d1 = new demo();
		d1.showI();
		d1.showJ();
	}
}
