package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value ="mgr")
public class Manager extends Employee {
private int deptId;
private String deptName;
public Manager() {
	// TODO Auto-generated constructor stub
}
public Manager(int deptId, String deptName) {
	super();
	this.deptId = deptId;
	this.deptName = deptName;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
@Override
public String toString() {
	return "Manager [deptId=" + deptId + ", deptName=" + deptName + "]";
}

}
