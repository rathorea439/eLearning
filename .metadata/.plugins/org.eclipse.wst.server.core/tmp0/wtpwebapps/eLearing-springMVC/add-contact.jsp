<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>
</head>
<body>
	<h2>Contact Registration</h2>
	<hr>
	<form:form action="register4" method="POST" modelAttribute="contact">
		<pre>
        Urer Id(Should be register) : <form:input path="user_id" /><br>
        User name  : <form:input path="name"/><br>
        Email  : <form:input path="email" /><br>
        Phone number  : <form:input path="phone_no" /><br>
        Message  : <form:input path="message" /><br>
        Contact ID  : <form:input path="contact_id" /><br>
        <input type="submit" value="Register" /> <input
				type="reset" value="Reset" />
        </pre>
	</form:form>
</body>
</html>