package com.evergent.corejava.exceptionhandling;

/* 3)All exceptions are executed while abnormal conditions only
 * 4)In normal flow it won’t execute any exceptions
 */
public class ExceptionDemo2 {
	String name = "null";

	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("I Can Handle" + e);
		}

	}

	public static void main(String[] args) {

		ExceptionDemo2 dm = new ExceptionDemo2();
		dm.myData();

	}

}
