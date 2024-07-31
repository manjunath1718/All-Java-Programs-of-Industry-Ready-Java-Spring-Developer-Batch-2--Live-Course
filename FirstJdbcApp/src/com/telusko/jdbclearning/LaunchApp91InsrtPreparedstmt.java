package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchApp91InsrtPreparedstmt {

	public static void main(String[] args) {

		Connection con = null;		
		PreparedStatement preparedstmt=null;
		try {
			//Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establish Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");

			
			//Creating connection statement and Execute Query
			String sql="insert into studentinfo values(?,?,?,?)";
			preparedstmt=con.prepareStatement(sql);

		    System.out.println("Please Enter following details to be stored");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Age");
			int age=sc.nextInt();
			System.out.println("Enter City");
			String city=sc.next();
			
			preparedstmt.setInt(1, id);
			preparedstmt.setString(2, name);
			preparedstmt.setInt(3, age);
			preparedstmt.setString(4, city);
						
			int rowsAffected=preparedstmt.executeUpdate();

			//Process the result
			if(rowsAffected==0)
				System.out.println("Failed to insert Record");
			else 
				System.out.println("Record inserted Successfully!");

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
