package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchApp93DltPrprdStmt {

	public static void main(String[] args) {

		Connection con = null;		
		PreparedStatement preparedstmt=null;
		try {
			//Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establish Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");

			
			//Creating connection statement and Execute Query
			String sql="delete from studentinfo where id=?";
			preparedstmt=con.prepareStatement(sql);

		    System.out.println("Please Enter following details to be updated");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id");
			int id=sc.nextInt();			
			
			preparedstmt.setInt(1, id);					
						
			int rowsAffected=preparedstmt.executeUpdate();

			//Process the result
			if(rowsAffected==0)
				System.out.println("Failed to delete Record");
			else 
				System.out.println("Record deleted Successfully!");

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
				preparedstmt.close();
				con.close();
			} 
			catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
