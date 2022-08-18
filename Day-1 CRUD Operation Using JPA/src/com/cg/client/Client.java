package com.cg.client;

import com.cg.entities.Employee1;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		EmployeeService ser = new EmployeeServiceImpl();
		Employee1 emp = new Employee1();
		
		emp.setID(101);
		emp.setEmp_name("Akanksha");
		ser.addEmployee(emp);

	}

}
