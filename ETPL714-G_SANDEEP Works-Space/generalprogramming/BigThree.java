package com.evergent.corejava.generalprogramming;

public class BigThree {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		if (a > b && a > c) {
			System.out.println("A is Big");
		} else if (b > a && b > c) {
			System.out.println("B is Big");
		} else {
			System.out.println("C is Big");
		}
	}

}
