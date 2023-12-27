<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page one</title>
</head>
<body>
<h1>Page one Content</h1>
<%
request.getRequestDispatches("pagetwo.jsp");
%>
</body>
</html>