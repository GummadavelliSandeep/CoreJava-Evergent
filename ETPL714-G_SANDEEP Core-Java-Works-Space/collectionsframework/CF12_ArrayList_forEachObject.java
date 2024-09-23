package com.evergent.corejava.collectionsframework;

import java.util.HashSet;
import java.util.Iterator;

public class CF12_ArrayList_forEachObject {
	public static void main(String[] args) {
		HashSet<Object> myList=new HashSet<>();
		myList.add(100);
		myList.add("Ven");
		myList.add("Ramesh");
		myList.add(45.5);
		for(Object o:myList) {
			System.out.println(o);
		}
	}
}
