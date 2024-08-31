package com.evergent.corejava.exceptionhandling;

public class StackOverFlowException17 {
	public static void recursiveMethod()// This Method keeps call itself
	{
		recursiveMethod();
	}

	public static void main(String[] args) {
		try {
			recursiveMethod();// start recursive method
		} catch (StackOverflowError e) {
			System.out.println("Caugt StackOverFlowException:" + e.getMessage());
		}
	}

}
