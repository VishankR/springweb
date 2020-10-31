<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Your Account</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath }/createAccount">
<table>
<tr><td>UserName : </td><td><input name="username" type="text"/></td></tr>
<tr><td>Email : </td><td><input name="email" type="text"/></td></tr>
<tr><td>Password : </td><td><input name="password" type="text"/></td></tr>
<tr><td></td><td><input value="Sign Up" type="submit"/></td></tr>
</table>
</form>
</body>
</html>