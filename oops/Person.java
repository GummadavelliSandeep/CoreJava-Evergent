package com.evergent.corejava.oops;

public class Person {
	String Name = "Sandeep";
	int Age = 22;
	String Address = "Hyderabad";

	public void Display() {
		System.out.println("Name:" + Name);
		System.out.println("Age:" + Age);
		System.out.println("Address:" + Address);
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.Display();
	}

}
