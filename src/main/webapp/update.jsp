<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page import="com.example.Employee_Management_System.entity.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  Employee employees =(Employee)request.getAttribute("update"); %>
<form action="update" method="post">
<input  type="text" name="employeeId" readonly="readonly" value="<%=employees.getEmployeeId()%>"><br>
<input type="text" name="name" value="<%=employees.getName()%>"><br>
<input type="text" name="role" value="<%=employees.getRole()%>"><br>
<input type="text" name="salary" value="<%=employees.getSalary()%>"><br>
<input type="submit" value="Update">
</form>

</body>
</html>