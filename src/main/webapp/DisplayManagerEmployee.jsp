<%@page import="net.bytebuddy.implementation.bind.annotation.Super"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>

<%@page import="com.model.Manager"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.model.Employee"%>
<%@page import="java.util.List"%>
<%@page import="dao.EmployeeDAOFactory"%>
<%@page import="dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Employee</title>
<style> 
 table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .button-cell {
            text-align: center;
        }
</style>
</head>
<body>
	   <table>
    <thead>
        <tr>
            <th>Emp-Id</th>
            <th>Name</th>
            <th>Hire Date</th>
            <th>Address</th>
            <th>DeptId</th>
            <th>DeptName</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
    </thead>
<%EmployeeDAOFactory employeeDAOFactory=new EmployeeDAOFactory();
   EmployeeDAO employeeDAO=employeeDAOFactory.getInstance();
   List<Manager>emplist=employeeDAO.getAllManager();
   Iterator itr=emplist.iterator();
   
   while(itr.hasNext()){
	   
	   Manager manager=(Manager)itr.next();
	   %>
	       <tbody>
        <tr>
            <td>  <%=manager.getId()%></td>
            <td> <%=manager.getName()%></td>
            <td>     <%=manager.getHireDate()%></td>
            <td>  <%=manager.getAddress()%></td>
            <td><%=manager.getDeptId()%></td>
            <td>  <%=manager.getDeptName()%></td>
            <td class="button-cell"><button><a href="">Delete Employee</a></button></td>
            <td class="button-cell"><button><a href="">Update Employee</a></button></td>
        </tr>
       
    </tbody>
  	 
	   
 <% System.out.println(); 
 }
  
%>
  
  
</table>
</body>
</html>