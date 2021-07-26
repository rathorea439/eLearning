<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Course Form</title>
</head>
<body>
	<h2>Update Course</h2>
	<hr>
	<c:url var="updateUrl" value="/update-course"></c:url>
	<form:form action="${updateUrl }" method="post" modelAttribute="course">
		<pre>
        Id        : <form:input path="course_id" readonly="true" />
			<br>
        Course Name  : <form:input path="c_name" />
			<br>
       
        Course Desp     : <form:input path="c_desp" />
			<br>
		Course fees     : <form:input path="c_fees" />
			<br>
		Course Resource     : <form:input path="c_resource" />
			<br>
			 
                    <input type="submit" value="Update Course" /> <input
				type="reset" value="Reset" />
        </pre>
	</form:form>
</body>
</html>