package com.evergent.corejava.abstractclasses;

/*- If any class extends abstract class then that class should be overridden 
 *- all the abstract methods,otherwise the class will be showing 
 * compile time error
 * */
public class ProductImp extends Product {
	public void newProduct() {
		System.out.println("My New Product");
	}

	public void allProducts() {
		System.out.println("All new Products");
	}

	public static void main(String[] args) {
		ProductImp pmImp = new ProductImp();// creating object for ProductImp class
		pmImp.newProduct();
		pmImp.allProducts();

		Product p = new ProductImp(); // Creating reference for abstract class
		p.allProducts();
		/*
		 * P.newProdcut(); we Can't access the local methods through reference of
		 * Abstractclass
		 */

	}

}
