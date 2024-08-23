package com.evergent.corejava.constructors;

//Super keyword is used to call the super class constructor
class MyEmployee {
	int eno;

	public MyEmployee() {

	}

	MyEmployee(int eno) {
		this.eno = eno;
		System.out.println("MyEmployee eno super class:" + eno);
	}
}

public class Employee6 extends MyEmployee {
	int eno;
	String ename;
	double sal;

	Employee6() {
		System.out.println("Default Constructor");
	}

	Employee6(int eno, String ename, double sal) {
		super(eno);
		this.ename = ename;
		this.sal = sal;

	}

	public void Display() {
		System.out.println("Name:" + ename);
		System.out.println("Salary:" + sal);
	}

	public static void main(String[] args) {
		new Employee6();
		Employee6 emp = new Employee6(2, "Ramesh", 33000);
		emp.Display();

	}
}
