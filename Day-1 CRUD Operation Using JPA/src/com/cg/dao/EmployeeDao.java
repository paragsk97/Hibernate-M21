package com.cg.dao;

import com.cg.entities.Employee1;

public interface EmployeeDao 
{
void addEmployee(Employee1 emp);
void updateEmployee(Employee1 emp);
Employee1 updateEmployeeByID(int ID);
void removeEmployee(Employee1 emp);

public abstract void commitTransaction();
public abstract void beginTransaction();
}