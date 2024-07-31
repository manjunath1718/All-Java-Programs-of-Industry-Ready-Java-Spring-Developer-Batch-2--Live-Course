package com.telusko.SpringDataJDBC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDataJDBC {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
//	private final String SQL_QUERY = "INSERT into implementers values(1,'Raj','GKK')";
	private final String SQL_QUERY = "INSERT into implementers values(?,?,?)";
	private final String SQL_DEL_QUERY = "DELETE from implementers where id=?";
	
//	public void insert() {
//		
//		jdbcTemplate.update(SQL_QUERY);
//		
//	}
	
	public void insert(Implementers impl) {
		
		int row = jdbcTemplate.update(SQL_QUERY,impl.getId(),impl.getName(),impl.getCity());
		System.out.println("Rows affected "+ row);
	}
	
    public void delete(Integer id) {
		
		int row = jdbcTemplate.update(SQL_DEL_QUERY,id);
		System.out.println("Record with id "+ id+" deleted");
	}
	
	

}
