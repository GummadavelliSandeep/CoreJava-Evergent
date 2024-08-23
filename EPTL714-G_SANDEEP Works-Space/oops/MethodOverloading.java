package com.evergent.corejava.oops;

public class MethodOverloading {
	public void LoginDetails() {
		System.out.println("Login Details");
	}

	public void LoginDetails(String uname, String pass) {
		System.out.println("UserName:" + uname);
		System.out.println("Password:" + pass);
	}

	public void LoginDetails(String uname, String pass, String captach) {
		System.out.println("UserName:" + uname);
		System.out.println("Password:" + pass);
		System.out.println("Captach:" + captach);
	}

	public int LoginDetails(int mobile, String pass) {
		System.out.println("Mobile:" + mobile);
		System.out.println("Password:" + pass);
		return 0;
	}

	public void show() {
		System.out.println("This is Show Method");
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.LoginDetails();
		mo.LoginDetails("SANDEEP", "Abc@123");
		mo.LoginDetails("AKHIL", "Abc@123", "1a26f4");
		mo.LoginDetails(708080, "Abc@123");

	}

}
