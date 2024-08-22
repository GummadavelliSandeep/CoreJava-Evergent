package com.evergent.corejava.generalprogramming;

import java.util.Scanner;

public class ScannerClassInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Addition of Two Number is:" + c);
	}

}
