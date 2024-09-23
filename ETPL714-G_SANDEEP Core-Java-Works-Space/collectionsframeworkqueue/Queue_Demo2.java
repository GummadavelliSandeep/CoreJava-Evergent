package com.evergent.corejava.collectionsframeworkqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo2 {

	public static void main(String[] args) {
		Queue<Integer>pq=new PriorityQueue<>();
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
