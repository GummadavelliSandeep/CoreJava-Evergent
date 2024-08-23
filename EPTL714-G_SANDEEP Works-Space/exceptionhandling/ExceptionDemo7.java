package com.evergent.corejava.exceptionhandling;

/*
 * Throws a exception layer by layer or method by method
 */
public class ExceptionDemo7 {
	String name = "null";
	int k = 2;

	public void myData() throws NullPointerException {
		System.out.println("ONE");
		System.out.println(name.length());
		int r = 10 / k;
		System.out.println("End");

	}

	public static void main(String[] args) {
		try {
			ExceptionDemo7 dm = new ExceptionDemo7();
			dm.myData();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
