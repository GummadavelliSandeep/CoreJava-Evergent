package com.evergent.corejava.interfaces;

/*If any class implements interface 
 * that class should be override all interface methods
 * otherwise that class will be showing the compile time error 
 * */
public class BookImps2 implements InterfaceBookDemo2 {
	public void bookTitle() {
		System.out.println("CoreJava");
	}

	public void bookAuthor() {
		System.out.println("Oracle Crop");
	}

	public void bookPrice() {
		System.out.println("Rs.550");
	}

	public void show() {
		System.out.println("This is local method show");
	}

	public static void main(String[] args) {
		BookImps2 bm = new BookImps2();
		bm.bookTitle();
		bm.bookAuthor();
		bm.bookPrice();
		bm.show();
		InterfaceBookDemo2 bm1 = new BookImps2();
//		we can't create object to interface,
//		but we can create reference to the interface
		bm1.bookTitle();
		bm1.bookAuthor();
		bm1.bookPrice();
		System.out.println(cname);/*
									 * Can access the static final variables directly
									 */
//		bm1.show();
		/*
		 * we can't access the local methods with object reference of the interface
		 */

	}

}
