package com.evergent.corejava.collectionsframeworkqueue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque9_poll {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("pineapple");;
		ad.addLast("Papaya");
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
	}

}
