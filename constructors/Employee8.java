package com.evergent.corejava.constructors;

//calling the super class displayInfo in the base class displayInfo method
class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Name" + name);
		System.out.println("Age:" + age);
	}
}

class Dog extends Animal {
	private String bread;

	public Dog(String name, int age, String bread) {
		super(name, age);
		this.bread = bread;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Bread:" + bread);
	}
}

public class Employee8 {
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy", 5, "Golden retrivers");
		dog.displayInfo();

	}
}
