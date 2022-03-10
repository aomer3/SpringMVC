<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>

<!-- data from ModelAndView can be  displayed in two ways -->

<!-- Method 1: JSP syntax -->
<%
Integer id = (Integer) request.getAttribute("id");
String name = (String) request.getAttribute("name");
Integer salary = (Integer) request.getAttribute("salary");

out.println("Id: " + id + "<br/>");
out.println("Name: " + name + "<br/>");
out.println("Salary: " + salary);
%>


<!-- Method 2: JSP Expression Language -->
<pre>
Id: <b>${id}</b> 
Name: <b>${name}</b>
Salary: <b>${salary}</b>
</pre>

</body>
</html>