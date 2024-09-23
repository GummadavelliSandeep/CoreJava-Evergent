package com.evergent.corejava.collectionsframeworkstack;

import java.util.Stack;

public class Stack_Demo2 {

	public static void main(String[] args) {
		Stack myStack=new Stack();
		myStack.add("Red");
		myStack.add("Black");
		myStack.add("White");
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack);

	}

}
