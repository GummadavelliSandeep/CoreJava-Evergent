package com.evergent.corejava.exceptionhandling;

/*
 * 5)Once any exceptions are occurring in java code 
 * then remain lines of code is unreachable
 */
public class ExceptionDemo3 {
	String name = "null";
	int k = 2;

	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			int r = 10 / k;
			System.out.println("End");

		} catch (NullPointerException e) {
			System.out.println("I Can Handle");
		} catch (ArithmeticException e) {
			System.out.println("I Can Handle");
		}

	}

	public static void main(String[] args) {

		ExceptionDemo3 dm = new ExceptionDemo3();
		dm.myData();

	}

}
