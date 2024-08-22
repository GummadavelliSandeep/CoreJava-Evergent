package com.evergent.corejava.strings;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = new String("Java");
		String str2 = new String("Java");
		if (str1 == str2) // == Compares the memory location of the two strings
		{
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		if (str1.equals(str2)) // .equals is Used to Compare the content of the string
		{
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
