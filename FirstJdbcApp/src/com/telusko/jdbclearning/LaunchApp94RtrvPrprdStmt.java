package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchApp94RtrvPrprdStmt {

	public static void main(String[] args) {

		Connection con = null;		
		PreparedStatement preparedstmt=null;
		try {
			//Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establish Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");

			
			//Creating connection statement and Execute Query
			String sql="select * from studentinfo where id=?";
			preparedstmt=con.prepareStatement(sql);

		    System.out.println("Please Enter following details to be Retrieved");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id");
			int id=sc.nextInt();			
			
			preparedstmt.setInt(1, id);					
						
			ResultSet rs = preparedstmt.executeQuery();

			//Process the result
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}

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
