package com.evergent.corejava.collectionsframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CF13_LinkedHashSet {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("CoreJava");
		list.add("J2EE");
		list.add("MyJava");
		Set<String>s=new HashSet<>();
		s.addAll(list);
		Set<String>s1=new HashSet<>();
		s1.add("CoreJava");
		s1.add("J2EE");
		s1.add("MyJava");
//		s1.add("Hello");
		if(s.equals(s1)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		System.out.println(s.containsAll(s1));
	}
}
