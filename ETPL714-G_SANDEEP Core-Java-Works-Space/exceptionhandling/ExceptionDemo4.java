package com.evergent.corejava.exceptionhandling;

/*
 * 17)We should follow exception hierarchical
 */
public class ExceptionDemo4 {
	String name = "null";
	int k = 0;

	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			int r = 10 / k;
			System.out.println("End");

		}
//		catch (Exception e) { // here we are getting error due to not following the hierarchical flow
//			System.out.println(e);
//		}
		catch (NullPointerException e) {
			System.out.println("I Can Handle");
		} catch (ArithmeticException e) {
			System.out.println("I Can Handle");
		}

	}

	public static void main(String[] args) {

		ExceptionDemo4 dm = new ExceptionDemo4();
		dm.myData();

	}

}
