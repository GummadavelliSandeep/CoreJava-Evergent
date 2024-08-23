package com.evergent.corejava.constructors;
//Calling one constructor to another constructor using this keyword

public class Employee5 {
	int eno;
	String ename;
	double sal;

	Employee5() {
		System.out.println("Default Constructor");
	}

	Employee5(int eno) {
		this.eno = eno;
	}

	Employee5(int eno, String ename, double sal) {
		this(eno);
		this.ename = ename;
		this.sal = sal;

	}

	public void Display() {
		System.out.println("Eno:" + eno);
		System.out.println("Name:" + ename);
		System.out.println("Salary:" + sal);
	}

	public static void main(String[] args) {
		new Employee5();
		Employee5 emp = new Employee5(2, "Ramesh", 33000);
		emp.Display();

	}
}
