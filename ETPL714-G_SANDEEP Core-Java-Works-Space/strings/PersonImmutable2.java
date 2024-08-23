package com.evergent.corejava.strings;

public final class PersonImmutable2 {
	private final String value;

//	Constructor to initialize the fields
	public PersonImmutable2(String value) {
		this.value = value;
	}

	public String MyValue() {
		return value;
	}

	public String toString() {
		return value;
	}
}
