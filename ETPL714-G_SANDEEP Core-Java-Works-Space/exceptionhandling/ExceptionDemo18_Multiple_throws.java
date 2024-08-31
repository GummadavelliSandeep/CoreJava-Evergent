package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo18_Multiple_throws {
	String name="null";
	int k=0;
	public void myData() throws NullPointerException,ArithmeticException{
		System.out.println("One");
		System.out.println(name.length());
		int r=k/0;
		System.out.println("End");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionDemo18_Multiple_throws em=new ExceptionDemo18_Multiple_throws();
			em.myData();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
