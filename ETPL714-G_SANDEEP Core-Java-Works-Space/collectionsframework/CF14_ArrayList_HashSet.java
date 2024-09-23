package com.evergent.corejava.collectionsframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CF14_ArrayList_HashSet {
	public static void main(String[] args) {
		LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
		//Adding elements to the LinkedHaset
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Manago");
		linkedHashSet.add("Grapes");
		
		//Display the LinkedHashSet
		System.out.println("LinkedHaset:"+linkedHashSet);
		for(String fruits:linkedHashSet) {
			System.out.println(fruits);
		}
		//Checking if the set contains an element
		System.out.println("Contains 'Mango'"+linkedHashSet.contains("Mango"));
		
		//Removing an element
		linkedHashSet.remove("Banana");
		System.out.println("After removing 'Banana'"+linkedHashSet);

		//clearing the LinkedHashSet
		linkedHashSet.clear();
		System.out.println("After Clearing:"+linkedHashSet);
	}
}
