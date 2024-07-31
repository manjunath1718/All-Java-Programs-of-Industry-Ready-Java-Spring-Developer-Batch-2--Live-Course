package com.telusko.SpringJDBCApi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementersDaoImpl implements ImplementersDao{

	@Autowired
	DataSource dataSource;
	List<Implementers> list;

	@Override
	public List<Implementers> getImplementersInfo() {

		try {
			System.out.println("DataSource implementation class name :"+dataSource.getClass().getName());
			
			Connection connection = dataSource.getConnection();
			System.out.println(" Connection name from Hikari CP "+connection.getClass().getName());
			
			PreparedStatement pstmt = connection.prepareStatement("SELECT * from implementers");

			ResultSet rs = pstmt.executeQuery();
			
			list=new ArrayList<>();
			while(rs.next()) {
				
				list.add(new Implementers(rs.getInt(1), rs.getString(2), rs.getString(3)));
				
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}


		return list;
	}

}
