package com.evergent.corejava.wrapperclasses;

public class WrapperClassesAutoBoxingUnBoxing3 {

	public static void main(String[] args) {
		int a = 10;
		Integer a1 = new Integer(a);
		int a2 = a1.intValue();

		char c = 'c';
		Character c1 = new Character(c);
		char c2 = c1.charValue();

		System.out.println("int Value is:" + a);
		System.out.println("Int Object Value is:" + a1);
		System.out.println("Converting Integer Object Value to Primitive Data Type:" + a2);
		System.out.println();

		System.out.println("char Value is:" + c);
		System.out.println("Character Object Value is:" + c1);
		System.out.println("Converting Character Object Value to Primitive Data Type:" + c2);
		System.out.println();

	}

}
