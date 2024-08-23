package com.evergent.corejava.oops;

public class Calculation {
	int a = 40;
	int b = 20;
	int c;

	public void Addition() // Normal method Addition
	{
		c = a + b;
		System.out.println("Addition of Two Numbers is:" + c);
	}

	public void Substraction() {
		c = a - b;
		System.out.println("Substraction of Two Numbers is:" + c);
	}

	public void Multiplication() {
		c = a * b;
		System.out.println("Multiplication of Two Numbers is:" + c);
	}

	public void Division() {
		c = a / b;
		System.out.println("Division of Two Numbers is:" + c);
	}

	public static void main(String[] args) {
		Calculation cal = new Calculation();// Object Creation
		cal.Addition();// Calling Addition method
		cal.Substraction();
		cal.Multiplication();
		cal.Division();
	}
}
