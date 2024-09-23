package com.evergent.corejava.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class CF10_ArrayList_Generics {
	public static void main(String[] args) {
		ArrayList<Integer> myList=new ArrayList();
		myList.add(100);
		myList.add(50);
		myList.add(45);
		myList.add(100);
		Iterator i=myList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
}
