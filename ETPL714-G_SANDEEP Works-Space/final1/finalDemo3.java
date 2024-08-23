package com.evergent.corejava.final1;

//final class can't be overridden
final class Myclass1 {
	public void MyProducts() {
		System.out.println("All Products");
	}
}

public class finalDemo3
//final classes can't be overridden in base classes
{
	final String cname = "India";

	public void MyData() {
//		cname="Welcome";
		System.out.println("Cname:" + cname);
	}

	public static void main(String[] args) {
		finalDemo3 fd = new finalDemo3();
		fd.MyData();
	}

}
