package com.evergent.corejava.static1;

//When class is loaded into java the static blocks get initialized first
//Then after words the static methods ,static variables and non-static methods and variables will get initialized
public class StaticDemo6 {
	static String name = "Raju";
	int age = 23;
	String address = "Hyd";

	public void display() {
		name = "Welcome";
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Address:" + address);
	}

	public static void main(String[] args) {
		StaticDemo6 dm = new StaticDemo6();
		System.out.println(dm.name);
		dm.display();
		StaticDemo6 dm1 = new StaticDemo6();
		System.out.println(dm1.name);
	}

}
