package com.cg.service;

import com.cg.entities.Employee1;

public interface EmployeeService 
{

	void addEmployee(Employee1 emp);
	void updateEmployee(Employee1 emp);
    Employee1 updateEmployeeByID(int ID);
    void removeEmployee(Employee1 emp);

}
