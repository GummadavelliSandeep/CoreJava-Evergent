package com.evergent.corejava.oops;

class Calculation1 {
	int a = 40;
	int b = 20;
	int c;

	public void Addition() {
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
}

public class IS_A extends Calculation1 {

	public static void main(String[] args) {

		IS_A is_A = new IS_A();
		is_A.Addition();
		is_A.Substraction();
	}

}
