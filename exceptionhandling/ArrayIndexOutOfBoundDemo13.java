package com.evergent.corejava.exceptionhandling;
/*
 * ArrayIndexOutOfBound Exception
 */

public class ArrayIndexOutOfBoundDemo13 {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7 };
		try {
			System.out.println("Accessing element at index10:" + arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
