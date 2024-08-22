package com.evergent.corejava.generalprogramming;

public class SwapToNumbers {
	public static void main(String[] args) {
		int a = 20, b = 30;
//		without using the third variable by doing arithmetic operations
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The Value of A:" + a);
		System.out.println("The Value of B:" + b);

	}

}
