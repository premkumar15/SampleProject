package org.oops;

public class Company extends Car {
	public void finish() {
		System.out.println("granted");
	}

	public void multiply() {
		System.out.println("Multiply");

	}

	public void division() {
		System.out.println("Division");

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
