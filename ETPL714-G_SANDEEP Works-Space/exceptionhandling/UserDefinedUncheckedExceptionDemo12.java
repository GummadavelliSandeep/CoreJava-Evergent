package com.evergent.corejava.exceptionhandling;

/*
 * UserDefined Exception InvalidScoreException
 */
class InvalidScoreException extends RuntimeException {
	public InvalidScoreException(String message) {
//		System.out.println("Hello,"+message);
		super(message);
	}
}

public class UserDefinedUncheckedExceptionDemo12 {
	public static void CheckScore(int score) throws InvalidAgeException {
		if (score < 0 || score > 100) {
			throw new InvalidAgeException("Score must be Between 0 and 100");
		} else {
			System.out.println("Score is Valid");
		}
	}

	public static void main(String[] args) {
		try {
			CheckScore(99);
		} catch (InvalidAgeException e) {
			System.out.println("Caught the Exception: " + e.getMessage());
		}
		System.out.println("Program Continues after handling the Exceptions");
	}

}
