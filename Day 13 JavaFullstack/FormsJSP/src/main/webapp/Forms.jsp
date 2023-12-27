<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forms</title>
</head>
<body>

<h1>Basic Forms</h1>

    <form action=<%=request.getContextPath() %>/demo method="post">

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>

        <br/>

        <label for="mobile">Mobile Number:</label>
        <input type="tel" id="mobile" name="mobile" pattern="[0-9]{10}" required>
        <small>Enter a 10-digit mobile number.</small>

        <br/>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <br/>

        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="male" required>
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="female" required>
        <label for="female">Female</label>
        <input type="radio" id="other" name="gender" value="other" required>
        <label for="other">Other</label>

        <br/>

        <input type="submit" value="Submit">

    </form>

</body>
</html>