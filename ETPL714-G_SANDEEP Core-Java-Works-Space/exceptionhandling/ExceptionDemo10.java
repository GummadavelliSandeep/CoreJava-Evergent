package com.evergent.corejava.exceptionhandling;
/*
 * Throw Exception Keyword
 */
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello,"+message);
	}
}
public class ExceptionDemo10 {
	int pno=130;
	public void myData()throws ProductNotFoundException {
		if(pno>120) {
			throw new ProductNotFoundException("This Product Not There");
		}
		else {
			System.out.println("product is there...");
		}
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo10 dm=new ExceptionDemo10();
			dm.myData();
		}
		catch (Exception e) {
			System.out.println("I Can Handle:"+e);
		}
		

	}

}
