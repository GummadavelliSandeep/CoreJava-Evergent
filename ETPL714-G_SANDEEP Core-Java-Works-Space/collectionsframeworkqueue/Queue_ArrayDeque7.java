package com.evergent.corejava.collectionsframeworkqueue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque7 {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("pineapple");;
		ad.addLast("Papaya");
		ad.offerFirst("kiwi");
		ad.offer("Apple");
		ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.size());
		boolean b=ad.isEmpty();
		System.out.println(b);
		ad.clear();
		System.out.println(ad);
	}

}
