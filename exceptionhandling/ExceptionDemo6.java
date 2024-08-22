package com.evergent.corejava.exceptionhandling;

/*
 * 16)Try followed by either catch block or finally block
 */
public class ExceptionDemo6 {
	String name = "null";
	int k = 2;

	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			int r = 10 / k;
			System.out.println("End");

		} finally {
			System.out.println("Finally block for closing the DB/Networking Conncections");
		}

	}

	public static void main(String[] args) {

		ExceptionDemo6 dm = new ExceptionDemo6();
		dm.myData();

	}

}
