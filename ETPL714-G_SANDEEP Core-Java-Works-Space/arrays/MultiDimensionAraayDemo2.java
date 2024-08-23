package com.evergent.corejava.arrays;

public class MultiDimensionAraayDemo2 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j && j == i) {
					arr[i][j] = 7;
				}
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
 * 7 0 0 0 0 
 * 0 7 0 0 0 
 * 0 0 7 0 0 
 * 0 0 0 7 0 
 * 0 0 0 0 7                  
 */
