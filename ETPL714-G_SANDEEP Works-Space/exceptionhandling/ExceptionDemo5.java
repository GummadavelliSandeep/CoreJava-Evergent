package com.evergent.corejava.exceptionhandling;

/*
 * 13)If Exception occurs or not finally block will be executed
 */
public class ExceptionDemo5 {
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
		} finally {
			System.out.println("Finally block for closing the DB/Networking Conncections");
		}

	}

	public static void main(String[] args) {

		ExceptionDemo5 dm = new ExceptionDemo5();
		dm.myData();

	}

}
