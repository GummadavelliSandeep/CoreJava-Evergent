package com.evergent.corejava.strings;
//If we want to represent any object as string then toString() comes into existence

/*If you print any object,java compiler internally invokes 
 * the toString() method on the object,So overriding the toString()method
 * will Print the desired output
 * By overriding the toString() method of object class,we can return values of the 
 * object,so we don't need to write much code
 */

public class toStringMethod {
	String name;
	int age;
	String address;

	toStringMethod(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String toString() // Compiler internally invokes this toStringMethod() and return the specified
								// values of s1
	{
		return name + " " + age + " " + address;
	}

	public static void main(String[] args) {
		toStringMethod ts = new toStringMethod("Sandeep", 23, "Hyd");
		System.out.println(ts);

	}

}
