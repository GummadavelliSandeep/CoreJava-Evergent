package com.evergent.corejava.collectionsframework;

import java.util.HashSet;
import java.util.Iterator;

public class CF4_HashSetDemo {
	public static void main(String[] args) {
		HashSet mySet=new HashSet();
		mySet.add(100);
		mySet.add("Hello");
		mySet.add(45.5);
		mySet.add(100);
		Iterator i=mySet.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
}