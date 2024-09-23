package com.evergent.java.jdbc.mysql;

/*
create database  evergentdb;
use evergentdb;
create table emp1(eno integer,ename varchar(20),sal float(8,2));

*/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_OperationsMysql_CURD3 {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner s = new Scanner(System.in);
		String username = "root";
		String password = "admin";
		String dbName = "evergentdb";
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";

		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url + dbName, username, password);

			while (flag) {
				System.out.println(
						"1.Insert\n2.Print Table\n3.Update Record\n4.Delete Record \n9.Exit\n\tEnter Choice: ");
				int choice = s.nextInt();

				switch (choice) {
				case 1:
					String query = "insert into emp1 values(?,?,?)";
					// PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
					PreparedStatement pstmt = con.prepareStatement(query);
					System.out.println("Enter Employee ID: ");
					int emp = s.nextInt();
					System.out.println("Enter Name: ");
					String ename = s.next();
					System.out.println("Enter Salary:");
					float sal = s.nextFloat();
					pstmt.setInt(1, emp);
					pstmt.setString(2, ename);
					pstmt.setFloat(3, sal);
					int i = pstmt.executeUpdate();
					System.out.println(i + " row inserted");
					System.out.println("\n\n");

					break;
				case 2:
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("Select * from emp1");
					while (rs.next()) {
						System.out.print("\nEmployee No. :" + rs.getInt(1));
						System.out.print("\t\tName:" + rs.getString(2));
						System.out.print("\tSal :" + rs.getFloat(3));
					}
					System.out.println("\n\n");
					break;
				case 3:
					//
					String query2 = "update emp1 set eno=? where ename= ?";
					// PreparedStatement pstmt1=(PreparedStatement)con.prepareStatement(query1);
					PreparedStatement pstmt2 = con.prepareStatement(query2);
					System.out.println("Enter Employee ID for Updating Empolyee Name: ");
					int id = s.nextInt();
					System.out.println("Enter New Name to Update: ");
					String temp1 = s.next();
					pstmt2.setInt(1,id);
					pstmt2.setString(2, temp1);
					int i2 = pstmt2.executeUpdate();
					System.out.println(i2 + " row Updated");
					break;
				case 4:
					//
					String query1 = "delete from emp1 where eno = ?";
					// PreparedStatement pstmt1=(PreparedStatement)con.prepareStatement(query1);
					PreparedStatement pstmt1 = con.prepareStatement(query1);
					System.out.println("Enter Employee ID for Delete Record: ");
					int temp = s.nextInt();
					pstmt1.setInt(1, temp);
					int i1 = pstmt1.executeUpdate();
					System.out.println(i1 + " row deleted");
					break;

				case 9:
					flag = false;
					break;
				default:
					flag = false;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}