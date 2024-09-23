package com.evergent.corejava.collectionsframeworkqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo5 {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
	}

}
