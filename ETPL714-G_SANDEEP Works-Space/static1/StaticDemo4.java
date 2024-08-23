package com.evergent.corejava.static1;

//Non-static method can access the static variables and static methods
public class StaticDemo4 {
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
		StaticDemo4 d4 = new StaticDemo4();
		d4.show();

	}

}
