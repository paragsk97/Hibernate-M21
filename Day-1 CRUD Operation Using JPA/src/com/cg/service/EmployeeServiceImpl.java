package com.cg.service;

import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImpl;
import com.cg.entities.Employee1;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao dao;
	
	public EmployeeServiceImpl() {
		super();
		dao=new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee1 emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee1 emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee1 updateEmployeeByID(int ID) {
		Employee1 emp = dao.updateEmployeeByID(ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee1 emp) {
		// TODO Auto-generated method stub
		
	}

}
