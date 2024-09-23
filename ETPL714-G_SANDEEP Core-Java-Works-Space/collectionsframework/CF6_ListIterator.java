package com.evergent.corejava.collectionsframework;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CF6_ListIterator {
	public static void main(String[] args) {
		List myList=new ArrayList<>();
		myList.add("ramu");
		myList.add("ravi");
		myList.add("balu");
		myList.add("bhanu");
		myList.add("Welcome");
		ListIterator li=myList.listIterator();
		while (li.hasNext()) {
			String s=(String)li.next();
			System.out.println(s);
			if(s.equals("balu")) {
				li.remove();
			}
		}
			while (li.hasPrevious()) {
				System.out.println(li.previous());
			}
		
	}
}
