package com.evergent.corejava.abstractclasses;

/*- abstract is a keyword
 *- abstract class is having abstract methods and concert methods
 * If any class is having one abstract method 
 * that class should be declared as abstract class
 * otherwise that class will show compile time error
 * */
abstract public class Product2 {
	abstract public void newProduct(); // abstract methods

	public void allProducts() { // Concert methods
		System.out.println("All new Products");
	}

	public Product2() { // Abstract class constructor
		System.out.println("This abstract class constructor");
	}

}
