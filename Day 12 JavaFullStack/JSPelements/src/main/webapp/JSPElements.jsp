<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Elements</title>
</head>
<body>
<h1>Examples</h1>
<br/>
<%="Hey JSP!..." %>
<br/>

<%--to print a var from method --%>

<%! public String greet(){
	return "Vamos i !";
}
%>
<%=greet() %>
<br/>
<br/>
<%! String a1="Mahesh"; String a2="Vaithi"; %>
<%String c = a1+a2; out.print("String Concat: "+c); %>
</body>
</html>