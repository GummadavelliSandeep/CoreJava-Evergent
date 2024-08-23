package com.evergent.corejava.generalprogramming;

public class SwitchStatement {
	public static void main(String[] args) {
		int i = 5;
		switch (i) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wenseday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Please Enter the Proper Input Value");
		}
	}

}
