package com.telusko.jdbclearning;


import java.sql.*;

public class LaunchApp7JdbcUtil {

	static {

		try {
			//Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() throws SQLException {
		//Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");			

		return con;		
	}
	public static void closeConnection(Connection con,Statement stmt) throws SQLException {
		con.close();
		stmt.close();
	}
	

}
