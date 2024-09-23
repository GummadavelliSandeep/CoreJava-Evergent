package com.evergent.corejava.collectionsframeworkstack;

import java.util.Stack;

public class Stack_Demo5_Methods {

	public static void main(String[] args) {
		Stack<String>stack=new Stack();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		stack.push("Cherry");
		stack.push("Date");
		System.out.println("Stack:"+stack);
		String topElement=stack.peek();
		System.out.println("TopElement:"+topElement);
		String removedElement=stack.pop();
		System.out.println("Popped element:"+removedElement);
		System.out.println("Stack After pop"+stack);
		boolean Isempty=stack.isEmpty();
		System.out.println("Is the stack empty?"+Isempty);
		int position=stack.search("Banana");
		if(position==-1) {
			System.out.println("Position of 'Banana' from top:"+position);
		}
		else {
			System.out.println("Banana is not in the stack");
		}
		stack.clear();
		System.out.println("stack After clearing"+stack);

	}

}
