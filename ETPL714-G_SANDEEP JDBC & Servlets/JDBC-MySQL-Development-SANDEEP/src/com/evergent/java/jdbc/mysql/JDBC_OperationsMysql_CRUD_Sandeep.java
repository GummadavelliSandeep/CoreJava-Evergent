package com.evergent.java.jdbc.mysql;
 import java.sql.*;
public class JDBC_OperationsMysql_CRUD_Sandeep {

	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver" );//Loading jdbc Driver class
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sandeep","root","admin");//Establishing Connection between java Objects and Mysql
			Statement st=con.createStatement();//Creating reference for Statement Interface
//			Creating table in database
//			int i=st.executeUpdate("create table student(sId int,sName varchar(20),Branch varchar(5))");
//			System.out.println(i+" table created");
			
//			Inserting values into student table
//			int i=st.executeUpdate("insert into student values(101,'Suresh','CSE')");
//			System.out.println(i+ " Row Successfully Inserted");
			
//			Updating values in student table
//			int i=st.executeUpdate("update student set Branch='It' where sId=100");
//			System.out.println(i+ " Row Successfully Updated");
			
//			Deleting values from student table
//			int i=st.executeUpdate("delete from student where sId=100");
//			System.out.println(i+ " Row Successfully Deleted");
			
//			Retrieving values from student table
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString("sName"));
				System.out.println(rs.getString("Branch"));
			}
		rs.close();
		st.close();
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
