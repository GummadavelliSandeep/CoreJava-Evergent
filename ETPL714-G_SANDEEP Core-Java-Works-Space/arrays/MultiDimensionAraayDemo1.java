package com.evergent.corejava.arrays;

public class MultiDimensionAraayDemo1 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];// Declaring the 2D Array of size [5]rows,[5]columns
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 7;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
/* Program
 * 7 7 7 7 7 
 * 7 7 7 7 7 
 * 7 7 7 7 7 
 * 7 7 7 7 7 
 * 7 7 7 7 7
 */

