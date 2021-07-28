<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course data</title>
</head>
<body>

<table border="1">
		<tr>
			<th>Course ID</th>
			<th>Course name</th>
			<th>course Description</th>
			<th>Course fees</th>
			<th>Course Resources </th>
		</tr>

		<c:forEach var="course" items="${list }">
			<tr>
				<td>${course.course_id }</td>
				<td>${course.c_name }</td>
				<td>${course.c_desp }</td>
				<td>${course.c_fees }</td>
				<td>${course.c_resource }</td>
	
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>