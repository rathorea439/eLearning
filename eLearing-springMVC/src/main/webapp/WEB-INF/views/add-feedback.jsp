<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Feedback</title>
</head>
<body>
	<h2>Feedback Registration</h2>
	<hr>
	<form:form action="register3" method="POST" modelAttribute="feedback">
		<pre>
        USer Id(should be registered) : <form:input path="user_id"  /><br>
        User Name  : <form:input path="name"/><br>
        User Email  : <form:input path="email" /><br>
        Feedback ID  : <form:input path="f_id" /><br>
        Feedback   : <form:input path="feedback" /><br>
        <input type="submit" value="Register" /> <input
				type="reset" value="Reset" />
        </pre>
	</form:form>
</body>
</html>