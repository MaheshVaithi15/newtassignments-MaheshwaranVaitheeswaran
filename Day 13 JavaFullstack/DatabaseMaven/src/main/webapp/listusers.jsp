<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.*" %>
   <%@ page import="org.example.entity.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
</head>
<body>
<h3>List Users</h3>
<hr/>
<table border="1">
<thead>
<th>UserId</th>
<th>UserName</th>
</thead>

<%
List<User> listusers = (List)request.getAttribute("listusers");
for(User u:listusers){
	out.print("<tr>");
	out.print("<td>"+u.getUser_id()+"</td>");
	out.print("<td>"+u.getUser_name()+"</td>");
	out.print("<tr>");
}

%>
</table>
</body>
</html>