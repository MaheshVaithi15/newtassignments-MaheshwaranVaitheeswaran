<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Page</title>
</head>
<body>
Name: <%=request.getParameter("name") %> <br/>
Email: <%=request.getParameter("email") %> <br/>
Mobile No: <%=request.getParameter("mobile") %> <br/>
</body>
</html>