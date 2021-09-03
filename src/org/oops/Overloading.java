package org.oops;

public class Overloading {
	public void man(String i,String j) {
System.out.println("human being"+ "+gender");
	}
public void animal(String i,int j) {
	System.out.println("good"+"+animals");

}
public static void main(String[] args) {
	Overloading o=new Overloading();
	o.animal("female", 0);
	o.man("dog", null);
}
}
