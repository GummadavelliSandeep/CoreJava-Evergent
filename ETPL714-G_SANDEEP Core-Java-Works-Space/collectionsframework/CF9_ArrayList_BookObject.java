package com.evergent.corejava.collectionsframework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;
class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}
public class CF9_ArrayList_BookObject {
	public static void main(String[] args) {
	Book b1=new Book("CoreJava");
	Book b2=new Book("Let us C");
	Book b3=new Book("Java Index Book");
	Book b4=new Book("Java Interview Book");
	Book b5=new Book("CoreJava New Version");
	
	ArrayList myList=new ArrayList();
	myList.add(b1);
	myList.add(b2);
	myList.add(b3);
	myList.add(b4);
	myList.add(b5);
	System.out.println(myList);
		
	}
}
