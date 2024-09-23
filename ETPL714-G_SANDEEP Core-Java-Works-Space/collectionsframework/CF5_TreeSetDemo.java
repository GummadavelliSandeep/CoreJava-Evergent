package com.evergent.corejava.collectionsframework;

import java.util.TreeSet;
import java.util.Iterator;

public class CF5_TreeSetDemo {
	public static void main(String[] args) {
		TreeSet mySet=new TreeSet();
		mySet.add(100);
		mySet.add(45);
		mySet.add(100);
		Iterator i=mySet.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
}
