package com.evergent.corejava.oops;

class InheritanceDemo1 {
	public void show() {
		System.out.println("This is Show Method");
	}
}

class InheritanceDemo extends InheritanceDemo1 {
	public void Display() {
		System.out.println("This is Display Method");
	}

	public static void main(String[] args) {
		InheritanceDemo ID = new InheritanceDemo();
		ID.show();
		ID.Display();

	}

}
