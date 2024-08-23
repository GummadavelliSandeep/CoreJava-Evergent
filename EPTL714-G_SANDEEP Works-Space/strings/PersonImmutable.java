package com.evergent.corejava.strings;

public final class PersonImmutable {
	private final String name;
	private final int age;

//	Constructor to initialize the fields
	public PersonImmutable(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String MyName() {
		return name;
	}

	public int MyAge() {
		return age;
	}

	public String tosString() {
		return name;
	}
}
