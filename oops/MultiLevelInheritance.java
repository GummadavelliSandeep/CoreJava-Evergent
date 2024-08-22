package com.evergent.corejava.oops;

class MyPerson {
	public void PersonInfo() {
		System.out.println("Rajesh");
	}
}

class PersonDetails extends MyPerson {
	public void PersonData() {
		System.out.println("Hyderabad");
	}
}

public class MultiLevelInheritance extends PersonDetails {
	public void Show() {
		System.out.println("Local Method");
	}

	public static void main(String[] args) {

		MultiLevelInheritance ml = new MultiLevelInheritance();
		ml.Show();
		ml.PersonInfo();
		ml.PersonData();

	}

}
