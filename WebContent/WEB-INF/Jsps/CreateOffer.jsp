<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Your Offer</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath }/doCreate">
<table>
<tr><td>Name : </td><td><input name="name" type="text"/></td></tr>
<tr><td>Email : </td><td><input name="email" type="text"/></td></tr>
<tr><td>Text : </td><td><textarea name="text" rows="10" cols="10"></textarea></td></tr>
<tr><td></td><td><input value="Create Advert" type="submit"/></td></tr>
</table>
</form>
</body>
</html>