package com.evergent.corejava.interfaces;

/*If any class implements interface 
 * that class should be override all interface methods
 * otherwise that class will be showing the compile time error 
 * */
public class BookImps implements InterfaceBookDemo, NewBook {
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

	public void AddNewBook() {
		System.out.println("Added New Book");
	}

	public void myData() // Interface extends method
	{
		System.out.println("My Data interface Information");
	}

	public static void main(String[] args) {
		BookImps bm = new BookImps();
		bm.bookTitle();
		bm.bookAuthor();
		bm.bookPrice();
		bm.show();
		bm.AddNewBook();/* Multiple Inheritance */
		InterfaceBookDemo bm1 = new BookImps();
//		we can't create object to interface,
//		but we can create reference to the interface
		bm1.bookTitle();
		bm1.bookAuthor();
		bm1.bookPrice();
//		bm1.show();
//		we can't access the local methods with object reference of the interface

	}

}
