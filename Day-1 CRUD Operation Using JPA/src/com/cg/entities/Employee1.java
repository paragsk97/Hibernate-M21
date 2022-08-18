package com.cg.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee1")
public class Employee1 implements Serializable {
private static final long serialVersionUID = 1L;
@Id
private int ID;
private String Emp_name;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getEmp_name() {
	return Emp_name;
}
public void setEmp_name(String emp_name) {
	Emp_name = emp_name;
}

}
