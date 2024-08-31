package com.evergent.corejava.exceptionhandling;
class InvalidWebsitException extends Exception {
	public InvalidWebsitException(String message) {
		super(message);
	}
}
public class ExceptionDemo21_InvalidWebsitException{
	public static void CheckWebSite(String strW)throws InvalidWebsitException  {
		if(!strW.equals("https://www.google.com")) {
			throw new InvalidWebsitException("Page Not Found:404");
		}
		else {
			System.out.println("Valid Url");
		}
		
	}
	public static void main(String[] args) {
		try {
			CheckWebSite("https://www.google.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
