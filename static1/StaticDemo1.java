package com.evergent.corejava.static1;

//static is keyword and static method can access the static variables and static methods
public class StaticDemo1 {
	static String cname = "India";

	static public void display() {
		System.out.println("MyData");
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo1.cname);
		StaticDemo1.display();

	}

}
