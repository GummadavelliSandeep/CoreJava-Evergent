package com.evergent.corejava.constructors;

public class Employee3 {
	int eno;
	String ename;
	double sal;

	Employee3()// Default Constructor
	{
		System.out.println("Default Constructor");
	}

	Employee3(int eno, String ename, double sal)// Parameterized Constructor
	{
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;

	}

	public void Display() // Display Method Normal Method
	{
		System.out.println("Eno:" + eno);
		System.out.println("Name:" + ename);
		System.out.println("Salary:" + sal);
	}

	public static void main(String[] args) {
		new Employee3();
		Employee3 emp = new Employee3(2, "Ramesh", 33000);
		emp.Display();

	}
}
