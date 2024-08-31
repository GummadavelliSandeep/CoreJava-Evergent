package com.evergent.corejava.exceptionhandling;
/*
 * Throws a exception layer by layer or method by method
 */
class ProductNotFoundException9 extends Exception {
	public ProductNotFoundException9(String message) {
		System.out.println("Hello," + message);
//		super(message)
	}
}

public class ExceptionDemo9 {
	int pno = 105;

	public void myData() throws ProductNotFoundException9 {
		if (pno > 100) {
			throw new ProductNotFoundException9("This Product is Not There..");
		} else {
			System.out.println("Product is There..");
		}
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo9 pd = new ExceptionDemo9();
			pd.myData();
		} catch (Exception e) {
			System.out.println("I Can handle:" + e.getMessage());
			System.out.println(e);
		}
	}

}
