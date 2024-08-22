package com.evergent.corejava.javabeans;

import java.io.Serializable;

public class StudentJavaBeanDemo3 implements Serializable {
	private int sno;
	private String sname;
	private String address;

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Student No:" + sno + "\n Student Name:" + sname + "\n Student Address:" + address;
	}

}
