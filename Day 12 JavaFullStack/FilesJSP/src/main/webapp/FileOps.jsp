<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File JSP</title>
</head>
<body>
<h2>Include Files in JSP</h2>
<hr/>
<br/>
<%--static include --%>
<%@include file="file1.txt" %>
<br/>
<br/>
<%--Dynamic include --%>
<jsp:include page="file2.txt"/>
</body>
</html>