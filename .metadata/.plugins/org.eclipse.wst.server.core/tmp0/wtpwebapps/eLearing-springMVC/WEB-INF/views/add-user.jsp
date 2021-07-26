<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<h2>User Registration</h2>
	<hr>
	<form:form action="register2" method="POST" modelAttribute="user">
		<pre>
        Id        : <form:input path="user_id" /><br>
        User name  : <form:input path="name"/><br>
        User phone number  : <form:input path="phone_no"/><br>
        User email  : <form:input path="email"/><br>
        User address  : <form:input path="address"/><br>
        User registration date  : <form:input path="reg_date"/><br>
        User password  : <form:password path="password"/><br>
		User photo  : <form:input path="upload_photo"/><br>        
        <input type="submit" value="Register" /> <input
				type="reset" value="Reset" />
        </pre>
	</form:form>
</body>
</html>