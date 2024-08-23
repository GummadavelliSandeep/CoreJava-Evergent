package com.evergent.corejava.abstractclasses;

/*- abstract is a keyword
 *- abstract class is having abstract methods and concert methods
 * If any class is having one abstract method 
 * that class should be declared as abstract class
 * otherwise that class will show compile time error
 * */
abstract public class Product {
	abstract public void newProduct(); // abstract methods

	public void allProducts() { // Concert methods
		System.out.println("All new Products");
	}

	public static void main(String[] args) {

	}

}
