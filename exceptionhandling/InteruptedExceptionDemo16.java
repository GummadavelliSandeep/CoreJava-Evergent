package com.evergent.corejava.exceptionhandling;

//InteruptedException 
public class InteruptedExceptionDemo16 {
	public static void main(String[] args) {
		try {
			System.out.println("I'm going to Sleeping mode for 3 seconds");
			Thread thread = new Thread();
			thread.sleep(3000);
			System.out.println("I woke Up after 3 Seconds,Now I'm ready");
		} catch (InterruptedException e) {
			System.out.println("Caught Exception:" + e.getMessage());
		}
	}

}
