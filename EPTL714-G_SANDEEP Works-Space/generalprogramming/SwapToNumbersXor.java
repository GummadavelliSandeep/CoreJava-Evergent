package com.evergent.corejava.generalprogramming;

public class SwapToNumbersXor {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("The Value of a:" + a);
		System.out.println("The Value of b:" + b);
	}

}
