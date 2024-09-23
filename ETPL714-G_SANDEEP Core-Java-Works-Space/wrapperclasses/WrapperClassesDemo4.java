package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

public class WrapperClassesDemo4 {

	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		int a=100;
		Integer i1=new Integer(a);
		myList.add(i1);
		System.out.println(myList);
		
		Integer i2=new Integer(200);
		myList.add(i2);
		System.out.println(myList);
		
		//@Here for the bove to lines of code the the Autoboxing and AutoUnboxing is done in ArrayList Class 
		myList.add(300);//Autoboxing
		System.out.println(myList.get(0));//AutoUnboxing
		
	
	}

}
