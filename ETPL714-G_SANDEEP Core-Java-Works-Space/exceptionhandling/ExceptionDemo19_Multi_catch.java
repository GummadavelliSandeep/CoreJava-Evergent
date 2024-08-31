package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo19_Multi_catch {
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
			ExceptionDemo19_Multi_catch em=new ExceptionDemo19_Multi_catch();
			em.myData();
		}
		catch (NullPointerException|ArithmeticException e) {
			System.out.println(e);
		}
	}

}
