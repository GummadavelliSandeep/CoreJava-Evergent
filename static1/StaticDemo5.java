package com.evergent.corejava.static1;

//When class is loaded into java the static blocks get initialized first
//Then after words the static methods ,static variables and non-static methods and variables will get initialized
public class StaticDemo5 {
	static {
		System.out.println("Hi,Welcome to Static Block");
	}
	static String cname = "India";
	String name = "Ramesh";

	static public void MyData() {
		System.out.println("MyData");
//		show(); non-static methods can't accessed in static methods
	}

	public void show() {
		MyData();
		System.out.println("Show is non-static method");
	}

	public static void main(String[] args) {
		MyData();
		System.out.println(cname);
		StaticDemo5 d4 = new StaticDemo5();
		d4.show();

	}

}
