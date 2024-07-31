package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp8Sol {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			con=LaunchApp7JdbcUtil.getConnection();

			stmt=con.createStatement();
			String sql="insert into studentinfo values (5,'rishabh',29,'delhi')";
			int rowsAffected=stmt.executeUpdate(sql);
			if(rowsAffected==0) {
				System.out.println("Unable to insert data");
			}else {
				System.out.println("inserted data successfully");
			}

		} catch (SQLException e) {			
			e.printStackTrace();
		}
		finally {
			try {
				LaunchApp7JdbcUtil.closeConnection(con, stmt);
			} catch (SQLException e) {					
				e.printStackTrace();
			}
		}


	}

}
