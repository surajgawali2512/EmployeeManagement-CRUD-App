package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value ="sprv")
public class Supervisor extends Employee {
private int deptId;
private String deptName;
public Supervisor() {
	// TODO Auto-generated constructor stub
}
public Supervisor(int deptId, String deptName) {
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
	return "Supervisor [deptId=" + deptId + ", deptName=" + deptName + "]";
}

}
