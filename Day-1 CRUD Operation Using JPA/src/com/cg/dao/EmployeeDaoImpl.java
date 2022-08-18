package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee1;

public class EmployeeDaoImpl implements EmployeeDao{

	private EntityManager entityManager;
	
	public EmployeeDaoImpl() {
		super();
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public void addEmployee(Employee1 emp) {
		entityManager.persist(emp);
		
	}

	@Override
	public void updateEmployee(Employee1 emp) {
		entityManager.merge(emp);
		
	}

	@Override
	public Employee1 updateEmployeeByID(int ID) {
		Employee1 emp = entityManager.find(Employee1.class, ID);
		return emp;
		
	}

	@Override
	public void removeEmployee(Employee1 emp) {
		entityManager.remove(emp);
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
}