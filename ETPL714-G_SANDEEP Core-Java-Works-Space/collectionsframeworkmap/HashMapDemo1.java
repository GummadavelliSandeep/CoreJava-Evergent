package com.evergent.corejava.collectionsframeworkmap;

import java.util.HashMap;

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap myMap=new HashMap();
		myMap.put(100, "Ramesh");
		myMap.put("200", "Bhalu");
		myMap.put(300, "Abbas");
		myMap.put(null, "abc");
		myMap.put(700, "null");
		System.out.println(myMap);
	}

}
