package com.evergent.corejava.final1;

//final is a keyword
//we can declare final as variables,methods and classes
//final method can't modify
public class finalDemo {
	final String cname = "India";

	public void MyData() {
//		cname="Welcome";
		System.out.println("Cname:" + cname);
	}

	public static void main(String[] args) {
		finalDemo fd = new finalDemo();
		fd.MyData();
	}

}
