package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchApp95AddBatch {

	public static void main(String[] args) {

		Connection con = null;		
		PreparedStatement preparedstmt=null;
		try {
			//Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Establish Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");

			
			//Creating connection statement and Execute Query
			String sql="update studentinfo set sage=? where id=?";
			preparedstmt=con.prepareStatement(sql);
		
			preparedstmt.setInt(2, 1);			
			preparedstmt.setInt(1, 34);
			preparedstmt.addBatch();
			
			preparedstmt.setInt(2, 2);			
			preparedstmt.setInt(1, 35);
			preparedstmt.addBatch();
			
			preparedstmt.setInt(2, 4);			
			preparedstmt.setInt(1, 31);
			preparedstmt.addBatch();
					
			int[] arr = preparedstmt.executeBatch();
			System.out.println("Check db table to see result");

			//Process the result
			for(int a:arr) {
				System.out.println(a);
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
