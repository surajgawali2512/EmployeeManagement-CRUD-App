<%@page import="com.model.Supervisor"%>
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
<title>Supervisor Employee</title>
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
   List<Supervisor>emplist=employeeDAO.getAllSupervisor();
   Iterator itr=emplist.iterator();
   
   while(itr.hasNext()){
	   
	   Supervisor supervisor=(Supervisor)itr.next();
	   %>
	       <tbody>
        <tr>
            <td>  <%=supervisor.getId()%></td>
            <td> <%=supervisor.getName()%></td>
            <td>     <%=supervisor.getHireDate()%></td>
            <td>  <%=supervisor.getAddress()%></td>
            <td><%=supervisor.getDeptId()%></td>
            <td>  <%=supervisor.getDeptName()%></td>
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