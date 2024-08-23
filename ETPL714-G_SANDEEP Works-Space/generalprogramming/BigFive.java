package com.evergent.corejava.generalprogramming;

public class BigFive {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40, e = 50;
		if (a > b && a > c && a > d && a > e) {
			System.out.println("A is Big");
		} else if (b > a && b > c && b > d && b > e) {
			System.out.println("B is Big");
		} else if (c > a && c > b && c > d && c > e) {
			System.out.println("C is Big");
		} else if (d > a && d > b && d > c && d > e) {
			System.out.println("D is Big");
		} else {
			System.out.println("E is Big");
		}
	}

}
