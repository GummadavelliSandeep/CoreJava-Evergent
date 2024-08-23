package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		EmployeeJavaBeansDemo1 em = new EmployeeJavaBeansDemo1();
		em.setEno(1);
		em.setEname("Ramesh");
		em.setSal(23000);
		System.out.println("EmployeeNo:" + em.getEno());
		System.out.println("EmployeeName:" + em.getEname());
		System.out.println("EmployeeSalary:" + em.getSal());
	}

}
