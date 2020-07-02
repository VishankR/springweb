<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Offers Jsp Page</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/createOffer">Create Your Offer</a><br>
<a href="${pageContext.request.contextPath }/offers">Show Offers</a>
</body>
</html>

<%-- Hey there! <br>
Request: <%= request.getAttribute("name") %> <br>
Request (Using EL): ${name} <br> 
<c:out value="${name}"></c:out><br> --%>
<%-- <sql:query var="rs" dataSource="jdbc/spring">
select id, name from offers
</sql:query> --%>