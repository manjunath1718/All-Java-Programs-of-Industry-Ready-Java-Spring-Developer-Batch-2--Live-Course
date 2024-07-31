package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp6HanndleExceptions {

	 

	public static void main(String[] args) {

	     Connection con = null;
	     Statement stmt = null;
		try {
			//Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establish Connection
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");

			//Creating connection statement
		     stmt=con.createStatement();

			//Execute Query
			String sql="delete from studentinfo where id=3";
			int rowsAffected=stmt.executeUpdate(sql);

			//Process the result
			if(rowsAffected==0)
				System.out.println("Failed to Delete Record");
			else 
				System.out.println("Record Deleted Successfully!");

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//Close resource
			try {
				stmt.close();
				con.close();
			} 
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
