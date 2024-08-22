package com.evergent.corejava.constructors;

//Including the Default Constructor with hard-coded values and the parameterized Constructor
class Mycar {
	String color;
	int maxspeed;

	public Mycar() {
		color = "White";
		maxspeed = 150;
	}

	Mycar(String color, int maxspeed) {
		this.color = color;
		this.maxspeed = maxspeed;
	}

	void display() {
		System.out.println("Color" + color);
		System.out.println("Maxspeed:" + maxspeed);
	}
}

public class Mycar7 {
	public static void main(String[] args) {
		Mycar car1 = new Mycar();
		Mycar car2 = new Mycar("Red", 170);
		car1.display();
		car2.display();

	}
}
