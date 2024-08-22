package com.evergent.corejava.javabeans;

public class ProductImpl2 {

	public static void main(String[] args) {
		ProductJavaBeansDemo2 pm = new ProductJavaBeansDemo2(100, "Laptop", 50000);
		System.out.println("EmployeeNo:" + pm.getPno());
		System.out.println("EmployeeName:" + pm.getPname());
		System.out.println("EmployeeSalary:" + pm.getPrice());
	}
}
