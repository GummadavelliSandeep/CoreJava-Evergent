package com.evergent.corejava.collectionsframeworkstack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Stack_Demo6 {

	public static void main(String[] args) {
		Stack<String>myStack=new Stack<>();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		System.out.println(myStack);
		System.out.println("Enumeration Iteration");
		Enumeration e=myStack.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		System.out.println("Iterator");
		Iterator il=myStack.iterator();
		System.out.println(il.next());
	System.out.println("for-each Advance loop");
	for(String s:myStack) {
		System.out.println(s);
		}
	}
}
