package com.evergent.corejava.oops;

class MethodOverriding1 {
	public void myData() {
		System.out.println("MyBigData:Class Method");
	}
}

public class MethodOverriding extends MethodOverriding1 {

	public void myData() {
		System.out.println("myData");
	}

	public void show() {
		System.out.println("This is Show Method");
	}

	public static void main(String[] args) {
		MethodOverriding mo = new MethodOverriding();
		mo.myData();
		mo.show();

	}

}
