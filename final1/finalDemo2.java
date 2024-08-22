package com.evergent.corejava.final1;

//final Method's can't be overriden
class Myclass {
	final public void MyProducts() {
		System.out.println("All Products");
	}
}

public class finalDemo2 extends Myclass {
	final String cname = "India";

//	public void MyProducts() {
//		System.out.println("Hello Products");
//	} final methods of super class can't be overriden in base class
	public void MyData() {
//		cname="Welcome";
		System.out.println("Cname:" + cname);
	}

	public static void main(String[] args) {
		finalDemo2 fd = new finalDemo2();
		fd.MyData();
		fd.MyProducts();
	}

}
