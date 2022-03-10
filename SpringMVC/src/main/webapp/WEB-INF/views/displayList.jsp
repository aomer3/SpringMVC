<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" 
    import="com.springMVC.dto.Employee, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display List</title>
</head>
<body>

<%
List<Employee> employees = (List<Employee>) request.getAttribute("employees");

out.println("Employee List"  + "<br/>");
for(Employee e: employees){
	out.print("Id: " + e.getId() + " | ");
	out.print(e.getName() + " | ");
	out.println("Salary: " + e.getSalary() + "<br/>");
}
%>

</body>
</html>