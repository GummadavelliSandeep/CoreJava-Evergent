package com.evergent.corejava.exceptionhandling;

/*
 * UserDefined Exception InvalidAgeException
 */
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
//		System.out.println("Hello,"+message);
		super(message);
	}
}

public class UserDefinedExceptionDemo10 {
	public static void CheckAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age Must be 18 or More");
		} else {
			System.out.println("Access Granted-You are Old Enough");
		}
	}

	public static void main(String[] args) {
		try {
			CheckAge(16);
		} catch (InvalidAgeException e) {
			System.out.println("Caught the Exception: " + e.getMessage());
		}
		System.out.println("Program Continues after handling the Exceptions");
	}

}
