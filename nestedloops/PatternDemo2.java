package com.evergent.corejava.nestedloops;

public class PatternDemo2 {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
	}

}
