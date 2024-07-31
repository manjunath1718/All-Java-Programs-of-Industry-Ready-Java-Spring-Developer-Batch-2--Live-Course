package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp2UpdateOp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");

		//Creating connection statement
		Statement stmt=con.createStatement();
		
		//Execute Query
		String sql="update studentinfo set sage=33 where sname='rohit'";
		int rowsAffected=stmt.executeUpdate(sql);
		
		//Process the result
		if(rowsAffected==0)
			System.out.println("updation failed");
		else 
			System.out.println("update successfull");
		
		//Close resource
		stmt.close();
		con.close();
		
	}

}
