package org.oops;

public class Company extends Car {
	public void finish() {
		System.out.println("granted");
	}

	public void add() {

		System.out.println("add");
	}

	public void sub() {
		System.out.println("Sub");

	}

	public static void main(String[] args) {
		Company x = new Company();
		x.finish();
		x.Brand();
		x.car();
		x.engine();
		x.Brand();
		x.craSH();

	}

}
