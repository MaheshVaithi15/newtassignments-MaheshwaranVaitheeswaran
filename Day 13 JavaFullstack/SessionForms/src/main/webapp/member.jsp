<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<h2>Welcome to Page</h2>

<%
String username = null, sessionId = null;
/*Cookie[] cookies = request.getCookies();
if(cookies!=null){
	for(Cookie cookie:cookies){
		if(cookie.getName().equals("username")){
			username=cookie.getValue();
			
		}
		if(cookie.getName().equals("JSESSIONID")){
			sessionId=cookie.getValue();
			
		}
		
	}
}
if(sessionId==null || username==null){
	response.sendRedirect("index.jsp");
} */

if(request.getSession().getAttribute("username")==null){
	response.sendRedirect("index.jsp");
}
else{
	username = request.getSession().getAttribute("username").toString();
	sessionId = request.getSession().getId();
}

%>
<br/>
<h3>Username:</h3>
<%=username %><br/>
<h3>SessionID:</h3>
<%=sessionId %>
<br/>
<hr/>
<h2>Session Quit</h2>
<br/>
<form action="<%=request.getContextPath()%>/logout" method="get">
<input type="hidden" name="action" value="destroy">
<input type="submit" value="logout">

</form>
</body>
</html>