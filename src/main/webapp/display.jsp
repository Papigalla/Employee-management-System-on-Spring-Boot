<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.example.Employee_Management_System.entity.Employee"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  List<Employee> employees =(List<Employee>)request.getAttribute("display"); %>
<table>
<thead>
<tr>
<td>Employee Id</td>
<td>Employee Name</td>
<td> Employee role</td>
<td>Employee salary</td>
<td>Delete</td>
<td>Edit</td>
</tr>
</thead>
<tbody>
<% for(Employee employee:employees){ %>
<tr>
<td><%=employee.getEmployeeId() %></td>
<td><%=employee.getName() %></td>
<td><%=employee.getRole() %></td>
<td><%=employee.getSalary() %></td>
<td><a href="delete-employee?employee_id=<%=employee.getEmployeeId() %>">Delete</a></td>
<td><a href="update-employee?employee_id=<%=employee.getEmployeeId() %>">Edit</a>
</tr>
<%} %>
</tbody>
</table>

</body>
</html>