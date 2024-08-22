package com.evergent.corejava.abstractclasses;

/*- If any class extends abstract class then that class should be overridden 
 *- all the abstract methods,otherwise the class will be showing 
 * compile time error
 * */
public class ProductImp2 extends Product2 {
	public void newProduct() {
		System.out.println("My New Product");
	}

	public void allProducts() {
		System.out.println("All new Products");
	}

	public static void main(String[] args) {
		ProductImp2 pmImp = new ProductImp2();// creating object for ProductImp class
		pmImp.newProduct();
		pmImp.allProducts();

		Product2 p = new ProductImp2(); // Creating reference for abstract class
		p.allProducts();
		/*
		 * P.newProdcut(); we Can't access the local methods through reference of
		 * Abstract class
		 */

	}

}
