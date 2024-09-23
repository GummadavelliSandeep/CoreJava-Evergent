package com.evergent.corejava.collectionsframework;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class CF8_LinkedListMethods {
	public static void main(String[] args) {
		LinkedList fruits=new LinkedList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		System.out.println("Initial LinkedList:"+fruits);
		//Adding an element at the begining
		fruits.addFirst("Mango");
		System.out.println("After adding first element:"+fruits);
		
		//Adding an element at the end
		fruits.addLast("Oranage");
		System.out.println("After adding last element:"+fruits);
		
		//Accessing element by index
		System.out.println("Element at index 2:"+fruits.get(2));
		
		//Removing the first and last element
		fruits.removeFirst();
		System.out.println("After removing first element:"+fruits);
		
		fruits.removeLast();
		System.out.println("After removing last element:"+fruits);
		
		//Checking if the linkedlist contains specific element
		System.out.println("Contains 'Banana'?"+fruits.contains("Banana"));
		
		//Removing an element by value
		fruits.remove("Banana");
		System.out.println("After removing Banana:"+fruits);
		
		//Get size
		System.out.println("Size of the linkedlist:"+fruits.size());
		
		//Clearing the fruits
		fruits.clear();
		System.out.println(fruits);
		
	}
}
