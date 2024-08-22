package com.evergent.corejava.static1;

//static method can't access the non-static variables and non-static methods
public class StaticDemo3 {
	static String cname = "India";
	String name = "Ramesh";

	static public void MyData() {
		System.out.println("MyData");
//		show(); non-static methods can't accessed in static methods
	}

	public void show() {
		System.out.println("Show is non-static method");
	}

	public static void main(String[] args) {
		System.out.println(cname);
		MyData();

	}

}
