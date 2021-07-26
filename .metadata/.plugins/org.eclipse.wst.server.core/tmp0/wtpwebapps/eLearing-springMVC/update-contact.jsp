<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Contact Form</title>
</head>
<body>
	<h2>Update Contact</h2>
	<hr>
	<c:url var="updateUrl" value="/update-contact"></c:url>
	<form:form action="${updateUrl }" method="post" modelAttribute="contact">
		<pre>
       USer Id     : <form:input path="user_id" readonly="true" />
			<br>
         Name  : <form:input path="name" />
			<br>
       
        Email    : <form:input path="email" />
			<br>
		Phone number     : <form:input path="phone_no" />
			<br>
		Message     : <form:input path="message" />
			<br>
		Contact ID     : <form:input path="contact_id" readonly="true" />
			<br>
			 
                    <input type="submit" value="Update Contact" /> <input
				type="reset" value="Reset" />
        </pre>
	</form:form>
</body>
</html>