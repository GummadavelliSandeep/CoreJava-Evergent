package com.evergent.corejava.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class CF3_ArrayListDemo {
	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		myList.add(100);
		myList.add("Hello");
		myList.add(45.5);
		myList.add(100);
		Iterator i=myList.iterator();
		System.out.println(myList.contains("Hello"));
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
}
