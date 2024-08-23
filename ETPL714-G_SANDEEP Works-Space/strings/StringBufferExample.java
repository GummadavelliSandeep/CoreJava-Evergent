package com.evergent.corejava.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Initial String:" + sb);
		// Append a string
		sb.append("World");
		System.out.println("After Append:" + sb);
		// Insert a String at a Specific position
		sb.insert(6, "Beautiful");
		System.out.println("After Insert:" + sb);
		// replace a substring
		sb.replace(0, 5, "Hi");
		System.out.println("After Replace:" + sb);
		// delete a substring
		sb.delete(0, 3);
		System.out.println("After Delete:" + sb);
		// reverse the string
		sb.reverse();
		System.out.println("After Reverse:" + sb);
		// capacity and length
		System.out.println("Capacity:" + sb.capacity());
		System.out.println("Length:" + sb.length());

	}

}
