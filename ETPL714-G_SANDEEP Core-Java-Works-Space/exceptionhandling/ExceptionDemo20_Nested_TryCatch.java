package com.evergent.corejava.exceptionhandling;import javax.crypto.NullCipher;

public class ExceptionDemo20_Nested_TryCatch {
	String name=null;
	int k=0;
	public void myData(){
		try {
			System.out.println("One");
			System.out.println(name.length());
			
			try {
				int r=k/0;
				System.out.println("Nested Try Block");
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			finally {
				System.out.println("finally Block:Inner Try Block");
			}
			System.out.println("End");
		}
		catch ( NullPointerException|ArithmeticException e) {
				System.out.println("I Can Handle:"+e);
			}
		finally {
			System.out.println("finally Block:Outer Try Block");
		}
		
	}
	
	public static void main(String[] args) {
			ExceptionDemo20_Nested_TryCatch em=new ExceptionDemo20_Nested_TryCatch();
			em.myData();
		}

}
