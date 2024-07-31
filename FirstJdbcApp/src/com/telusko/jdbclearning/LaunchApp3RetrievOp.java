package com.telusko.jdbclearning;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp3RetrievOp {



	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");

		//Creating connection statement
		Statement stmt=con.createStatement();
		
		//Execute Query
		String sql="select * from studentinfo";
		ResultSet rs = stmt.executeQuery(sql);
		
		//Process the result
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			//	System.out.println(rs.getInt("id")+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString("scity"));
		}
		
		//Close resource
		stmt.close();
		con.close();

	}

}
