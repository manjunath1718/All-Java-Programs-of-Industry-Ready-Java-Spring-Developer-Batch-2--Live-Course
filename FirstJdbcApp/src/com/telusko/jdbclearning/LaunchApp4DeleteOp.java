package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp4DeleteOp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");

		//Creating connection statement
		Statement stmt=con.createStatement();

		//Execute Query
		String sql="delete from studentinfo where id=3";
		int rowsAffected=stmt.executeUpdate(sql);

		//Process the result
		if(rowsAffected==0)
			System.out.println("Failed to Delete Record");
		else 
			System.out.println("Record Deleted Successfully!");

		//Close resource
		stmt.close();
		con.close();

	}

}
