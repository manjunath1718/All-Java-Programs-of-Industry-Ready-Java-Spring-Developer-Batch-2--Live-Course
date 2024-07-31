package com.telusko.jdbclearning;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class LaunchApp96CallableStmt {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");
		
			CallableStatement callableStmt=con.prepareCall("call getStudentsBasedOnCity(?)");
		
			System.out.println("Enter city");
			String city=sc.next();
			callableStmt.setString(1, city);
			
			ResultSet rs = callableStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}catch (SQLException e) {

			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}












	}

	private static void getStudentsBasedOnCity() {
		// TODO Auto-generated method stub
		
	}

}
