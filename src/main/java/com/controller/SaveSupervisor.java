package com.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Address;
import com.model.Employee;
import com.model.Supervisor;

import dao.EmployeeDAO;
import dao.EmployeeDAOFactory;


@WebServlet("/SaveSupervisor")
public class SaveSupervisor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  EmployeeDAO employeeDAO=EmployeeDAOFactory.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String empid=request.getParameter("employeeid");
	int empId=Integer.parseInt(empid);
	System.out.println(empId);
	String empname=request.getParameter("employeename");
	System.out.println(empname);
	String hiredate=request.getParameter("hiredate");
	LocalDate date=LocalDate.parse(hiredate);
	System.out.println(date);
	String area=request.getParameter("area");
	System.out.println(area);
	String city=request.getParameter("city");
	System.out.println();
	String pincode=request.getParameter("pincode");
	int pinCode=Integer.parseInt(pincode);
	System.out.println(pinCode);
	String deptid=request.getParameter("deptid");
	int deptId=Integer.parseInt(deptid);
	System.out.println(deptId);
	String deptname=request.getParameter("deptname");
	System.out.println(deptname);
	Supervisor supervisor=new Supervisor();
	Address address=new Address(area,city,pinCode);
	supervisor.setId(empId);
	supervisor.setName(empname);
	supervisor.setHireDate(date);
	supervisor.setAddress(address);
	supervisor.setDeptId(deptId);
	supervisor.setDeptName(deptname);
	employeeDAO.saveSupervisor(supervisor);
	 
	RequestDispatcher rd=request.getRequestDispatcher("/DisplaySupervisorEmployee.jsp");
	rd.include(request, response);
	
	
	}


}
