package com.evergent.corejava.constructors;

public class Employee2 {
	int eno;
	String ename;
	double sal;

	Employee2()// Default Constructor
	{
		System.out.println("Default Constructor");
	}

	Employee2(int eno1, String ename1, double sal1)// Parameterized Constructor
	{
		eno = eno1;
		ename = ename1;
		sal = sal1;

	}

	public void Display() {
		System.out.println("Eno" + eno);
		System.out.println("Name" + ename);
		System.out.println("Salary" + sal);
	}

	public static void main(String[] args) {
		new Employee2();
		Employee2 emp = new Employee2(2, "Ramesh", 33000);
		emp.Display();

	}
}