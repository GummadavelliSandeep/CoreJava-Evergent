package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo2 {

	public static void main(String[] args) {
		int a=10;
		Integer a1=new Integer(a);
		int a2=a1.intValue();
		
		double d=799.89;
		Double d1=new Double(d);
		double d2=d1.doubleValue();
		
		byte b=10;
		Byte b1=new Byte(b);
		byte b2=b1.byteValue();
		
		System.out.println("int Value is:"+a);
		System.out.println("Int Object Value is:"+a1);
		System.out.println("Converting Integer Object Value to Primitive Data Type:"+a2);
		System.out.println();
		
		System.out.println("double Value is:"+d);
		System.out.println("double Object Value is:"+d1);
		System.out.println("Converting Double Object Value to Primitive Data Type:"+d2);
		System.out.println();
		
		System.out.println("byte Value is:"+b);
		System.out.println("Byte Object Value is:"+b1);
		System.out.println("Converting Byte Object Value to Primitive Data Type:"+b2);
		
		
	
	}

}
