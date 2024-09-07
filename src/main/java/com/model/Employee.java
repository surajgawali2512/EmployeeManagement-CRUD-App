package com.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="Dept",discriminatorType = DiscriminatorType.STRING)

public class Employee {
	@Id
private int id;
private String name;
private LocalDate hireDate;
@Embedded
private Address address;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, LocalDate hireDate, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.hireDate = hireDate;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getHireDate() {
	return hireDate;
}
public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", hireDate=" + hireDate + ", address=" + address + "]";
}

}
