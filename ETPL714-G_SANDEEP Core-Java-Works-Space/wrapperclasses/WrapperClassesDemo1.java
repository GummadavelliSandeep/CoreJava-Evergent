package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo1 {

	public static void main(String[] args) {
		int a=10;
		//AutoBoxing
		//Automatic int to object
		Integer il=new Integer(a);
		System.out.println(il);
		
		//AutoUnboxing
		//Converting the Object Values into int data type
		int al=il.intValue();
		System.out.println(al);
	}

}
