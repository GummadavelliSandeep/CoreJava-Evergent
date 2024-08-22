package com.evergent.corejava.oops;

public class InheritanceDemo2 extends Calculation {
	public void show() {
		System.out.println("Local Method");
	}

	public static void main(String[] args) {
		InheritanceDemo2 ID = new InheritanceDemo2();
		ID.show();
		ID.Addition();

	}

}
