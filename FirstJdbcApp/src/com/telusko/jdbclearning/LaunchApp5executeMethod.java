package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp5executeMethod {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root");

		//Creating connection statement
		Statement stmt=con.createStatement();

		//Execute Query
		String sql="update studentinfo set sname='KL rahul' where id=4";
		boolean status=stmt.execute(sql);//return true if we performing select(retrieve) operation OR 
		                                 //return false if we performing non-select operation

		//Process the result
		if(status) {
			//retrieve
			ResultSet rs=stmt.getResultSet();
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
		}
		else {
			//insert,update,delete
			int rowsAffected=stmt.getUpdateCount();
			if(rowsAffected==0) 
				System.out.println("Operation failed");
			else 
				System.out.println("Operation successfull");
			
		}

		//Close resource
		stmt.close();
		con.close();


	}

}
