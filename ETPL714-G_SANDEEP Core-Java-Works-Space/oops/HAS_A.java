package com.evergent.corejava.oops;

public class HAS_A {
	int a = 10, b = 30;

	public void Addition() {
		System.out.println("Addition of Two Numbers is:" + (a + b));
	}

	public static void main(String[] args) {
		HAS_A hsA = new HAS_A();// Creating Object for the class
		hsA.Addition();// Accessing methods through HAS-A Relation
		Calculation cal = new Calculation();
		cal.Substraction();

	}

}
