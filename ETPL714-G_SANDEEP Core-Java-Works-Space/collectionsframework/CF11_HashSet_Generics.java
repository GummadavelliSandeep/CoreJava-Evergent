package com.evergent.corejava.collectionsframework;

import java.util.HashSet;
import java.util.Iterator;

public class CF11_HashSet_Generics {
	public static void main(String[] args) {
		HashSet<Integer> myList=new HashSet<>();
		myList.add(100);
		myList.add(50);
		myList.add(45);
		myList.add(100);
		Iterator i=myList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		for(int n:myList) {
			System.out.println(n);
		}
	}
}
