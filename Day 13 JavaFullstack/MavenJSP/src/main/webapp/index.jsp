<html>
<head>
<%@ page import="org.demo.Hello,java.util.Date" %>
</head>
<body>
<h2>Hello World!</h2>
<%=new Hello().message() %>
<br/>
<%out.print(new Date()); %>
<%
response.sendRedirect("pagetwo.jsp");

%>
</body>
</html>
