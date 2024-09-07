package com.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Address;
import com.model.Manager;

import dao.EmployeeDAO;
import dao.EmployeeDAOFactory;


@WebServlet("/SaveManager")
public class SaveManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
     // EmployeeDAOFactory employeeDAOFactory=new EmployeeDAOFactory();
      EmployeeDAO employeeDAO=EmployeeDAOFactory.getInstance();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid=request.getParameter("employeeid");
	    int empId=Integer.parseInt(empid);
	    System.out.println(empId);
	    String empname=request.getParameter("employeename");
	    System.out.println(empname);
	    String hiredate=request.getParameter("hiredate");
	    
	    LocalDate date=LocalDate.parse(hiredate);//yy-mm-dd
	    System.out.println(date);
	    String area=request.getParameter("area");
	    System.out.println(area);
	    
	    String city=request.getParameter("city");
	    System.out.println(city);
	    String pincode=request.getParameter("pincode");
	    
	    int pincode1=Integer.parseInt(pincode);
	    System.out.println(pincode1);
	    String deptid=request.getParameter("deptid");
	    int deptId=Integer.parseInt(deptid);
	    System.out.println(deptid);
	    String deptName=request.getParameter("deptname");
	    System.out.println(deptName);
	    Manager manager=new Manager();
	    Address address=new Address(area,city,pincode1);
	    
	    manager.setId(empId);
	    manager.setName(empname);
	    manager.setHireDate(date);
	    manager.setAddress(address);
	    manager.setDeptId(deptId);
	    manager.setDeptName(deptName);
	    employeeDAO.saveManager(manager);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("/DisplayManagerEmployee.jsp");
	    rd.include(request, response);
	}

}
