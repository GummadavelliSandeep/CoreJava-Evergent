package com.evergent.corejava.constructors;

//Copy Constructor Object
class student9 {
	private String name;
	private int age;

	public student9(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public student9(student9 s) {
		this.name = s.name;
		this.age = s.age;
	}

	public void displayInfo() {
		System.out.println("Name" + name);
		System.out.println("Age:" + age);
	}
}

public class Employee9 {
	public static void main(String[] args) {
		student9 st = new student9("Ramesh", 5);
		student9 st1 = new student9(st);
		st.displayInfo();
		st1.displayInfo();

	}
}
