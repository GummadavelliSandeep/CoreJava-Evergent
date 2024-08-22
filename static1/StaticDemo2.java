package com.evergent.corejava.static1;

//static method can access the static variables and static methods only
public class StaticDemo2 {
	static String cname = "India";
	String name = "Ramesh";

	static public void MyData() {
		System.out.println("MyData");
	}

	public void show() {
		System.out.println("Show is non-static method");
	}

	public static void main(String[] args) {
		System.out.println(cname);
		MyData();

	}

}
