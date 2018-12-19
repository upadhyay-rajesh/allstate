package com.collection;



import java.util.ArrayList;

import com.collection.entity.Employee;
import com.dao.Employee_DAO;


public class ArrayList_Demo {

	public ArrayList<Employee> main() {
		ArrayList<Employee> emp=null;
		Employee_DAO d=new Employee_DAO();
		try{
		emp=d.showAllData();
		System.out.println(emp.size());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		for(Employee o:emp){
			System.out.println("hello");
			System.out.println("name= "+o.getEmp_name()+" password= "+o.getPassword()+" email= "+o.getEmail()+" address= "+o.getAddress());
			
		}
		
		return emp;
	}

}
