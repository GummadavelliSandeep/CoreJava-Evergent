package com.evergent.corejava.exceptionhandling;

/*
 * Throws a exception layer by layer or method by method
 */
public class ExceptionDemo8 {
	String name = null;

	public void myData() throws NullPointerException {
		System.out.println("ONE");
		System.out.println(name.length());
		System.out.println("End");

	}

	public void Info() throws NullPointerException {
		myData();
		System.out.println("My Info Method");
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo8 dm = new ExceptionDemo8();
			dm.Info();
		} catch (Exception e) {
			System.out.println("I Can Handle:" + e);
		}

	}

}
