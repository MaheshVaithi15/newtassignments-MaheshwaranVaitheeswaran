
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Props</title>
</head>
<body>
<jsp:useBean id="user" class="org.demo.User" scope="session"></jsp:useBean>
<jsp:getProperty property="fname" name="user"/>
<jsp:getProperty property="lname" name="user"/>
</body>
</html>