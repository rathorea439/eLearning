<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add admin</title>
</head>
<body>
	<h2>User Registration</h2>
	<hr>
	<form:form action="register" method="POST" modelAttribute="admin">
		<pre>
        Id        : <form:input path="admin_id" /><br>
        Username  : <form:input path="name"/><br>
        Email  : <form:input path="email" /><br>
        Password    : <form:password path="password" /><br>
                    <input type="submit" value="Register" /> <input
				type="reset" value="Reset" />
        </pre>
	</form:form>
</body>
</html>