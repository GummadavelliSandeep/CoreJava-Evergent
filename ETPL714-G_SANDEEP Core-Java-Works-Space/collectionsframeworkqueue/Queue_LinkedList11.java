package com.evergent.corejava.collectionsframeworkqueue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList11 {

	public static void main(String[] args) {
		Deque<String> ql = new LinkedList<>();
		ql.add("Banana");
		ql.addFirst("pineapple");;
		ql.addLast("Papaya");
		ql.offerFirst("kiwi");
		ql.offer("Apple");
		ql.offerLast("Mango");
		System.out.println(ql);
		System.out.println(ql.size());
		boolean b=ql.isEmpty();
		System.out.println(b);
		ql.clear();
		System.out.println(ql);

	}

}
