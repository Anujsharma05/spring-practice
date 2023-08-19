<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.course.spring.springmvc.dto.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
	<%
		List<Employee> list = (List<Employee>) request.getAttribute("empList");
		
	for(Employee e: list) {
		out.println(e.getName());
	}
		
	%>
</body>
</html>