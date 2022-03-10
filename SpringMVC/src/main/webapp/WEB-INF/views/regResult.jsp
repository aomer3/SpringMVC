<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Result</title>
</head>
<body>

User Registered successfully. User details are: <br/>

<%=request.getAttribute("user")%>

</body>
</html>