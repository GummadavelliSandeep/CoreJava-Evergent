package com.evergent.corejava.exceptionhandling;

/*
 * UserDefined Exception InsufficientFundsException
 */
class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
//		System.out.println("Hello,"+message);
		super(message);
	}
}

public class UserDefinedExceptionFundsDemo11 {
	public static void Withdraw(double amount) throws InvalidAgeException {
		if (amount > 500) {
			throw new InvalidAgeException("Insufficient Balance In Your Account");
		} else {
			System.out.println("Transaction is Sccuessfull");
		}
	}

	public static void main(String[] args) {
		try {
			Withdraw(600);
		} catch (InvalidAgeException e) {
			System.out.println("Caught the Exception: " + e.getMessage());
		}
		System.out.println("Program Continues after handling the Exceptions");
	}

}
