package com.evergent.corejava.strings;

public class MainPerson {

	public static void main(String[] args) {
		PersonImmutable person = new PersonImmutable("Sandeep", 23);
		System.out.println("Name:" + person.MyName());
		System.out.println("Age:" + person.MyAge());

	}

}
