package com.evergent.corejava.collectionsframeworkmap;

import java.util.Hashtable;
/*
 * Null keys and Null values are not allowed in Hashtable
 */
public class HashTableDemo2 {
	public static void main(String[] args) {
		Hashtable myMap=new Hashtable();
		myMap.put(100, "Ramesh");
		myMap.put("200", "Bhalu");
		myMap.put(300, "Abbas");
//		myMap.put(null, "abc");
//		myMap.put(700, "null");
		System.out.println(myMap);
	}

}
