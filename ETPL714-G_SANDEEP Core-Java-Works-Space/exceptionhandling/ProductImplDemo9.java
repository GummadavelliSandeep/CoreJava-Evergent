package com.evergent.corejava.exceptionhandling;

/*
 * UserDSefined Exception ProductNotFoundException
 */
class ProductNotFoundException extends Exception {
	public ProductNotFoundException(String message) {
		System.out.println("Hello," + message);
	}
}

public class ProductImplDemo9 {
	int pno = 105;

	public void myData() throws ProductNotFoundException {
		if (pno > 100) {
			throw new ProductNotFoundException("This Product is Not There..");
		} else {
			System.out.println("Product is There..");
		}
	}

	public static void main(String[] args) {
		try {
			ProductImplDemo9 pd = new ProductImplDemo9();
			pd.myData();
		} catch (Exception e) {
			System.out.println("I Can handle:" + e.getMessage());
			System.out.println(e);
		}
	}

}
