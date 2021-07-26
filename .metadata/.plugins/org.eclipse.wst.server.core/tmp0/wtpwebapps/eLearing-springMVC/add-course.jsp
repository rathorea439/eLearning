<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Course</title>
</head>
<body>
	<h2>Course Registration</h2>
	<hr>
	<form:form action="register1" method="POST" modelAttribute="course">
		<pre>
        Id        : <form:input path="course_id" /><br>
        Course name  : <form:input path="c_name"/><br>
        Course desp  : <form:input path="c_desp" /><br>
        Course fees  : <form:input path="c_fees" /><br>
        Course Resources  : <form:input path="c_resource" /><br>
        <input type="submit" value="Register" /> <input
				type="reset" value="Reset" />
        </pre>
	</form:form>
</body>
</html>