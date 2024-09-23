package com.evergent.corejava.collectionsframeworkqueue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList10 {

	public static void main(String[] args) {
		Deque<String> ql = new LinkedList<>();
		ql.add("Banana");
		ql.addFirst("pineapple");;
		ql.addLast("Papaya");
		System.out.println(ql);
		System.out.println(ql.peek());
	}

}
