<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<h2>It is HomePage...</h2>
<br/>
<a href="<%request.getContextPath();%>/Controller?page=Login">Login</a><br/>
<a href="<%request.getContextPath();%>/Controller?page=signup">SignUp</a><br/>
<a href="<%request.getContextPath();%>/Controller?page=about">About</a><br/>
</body>
</html>