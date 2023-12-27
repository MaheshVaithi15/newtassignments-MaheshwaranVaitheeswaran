<html>
<body>
<h2>Login Page</h2>

<hr/>
<br/>
<form action="<%=request.getContextPath()%>/SessionForms" method="post">
UserName: <input type="text" name="username"><br/><br/>
Password: <input type="password" name="password"><br/><br/>
<input type="submit" value="Login">
</form>
</body>
</html>
