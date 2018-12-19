package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.collection.entity.Employee;

public class Employee_DAO {
	Connection conn;
	public Connection getConnection()throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2","system","rajesh");
		return conn;
		
	}
	public ArrayList<Employee> showAllData()throws Exception{
		conn=getConnection();
		String sql="select * from sg_employee";
		PreparedStatement stmt=conn.prepareStatement(sql);
					
		ResultSet res=stmt.executeQuery();
		ArrayList<Employee> emp=new ArrayList<Employee>();
		while(res.next()){
			
			
			Employee e1=new Employee();
			
			e1.setEmp_name(res.getString(1));
			e1.setEmail(res.getString(2));
			e1.setAddress(res.getString(3));
			e1.setPassword(res.getString(4));
			
			emp.add(e1);
		
		}
		return emp;
	}

}
