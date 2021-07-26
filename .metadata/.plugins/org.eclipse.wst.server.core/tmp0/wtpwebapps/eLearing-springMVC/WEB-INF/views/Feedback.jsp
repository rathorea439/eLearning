<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback data</title>
</head>
<body>

<table border="1">
		<tr>
			<th>User ID</th>
			<th>User name</th>
			<th>User Email</th>
			<th>Feedback ID</th>
			<th>Feedback </th>
			<th>Actions</th>
		</tr>

		<c:forEach var="feedback" items="${list }">
			<tr>
				<td>${feedback.user_id }</td>
				<td>${feedback.name }</td>
				<td>${feedback.email }</td>
				<td>${feedback.f_id }</td>
				<td>${feedback.feedback }</td>
				<td><a href="<c:url value='/delete-feedback/${feedback.f_id }'/>">Delete</a>
					| <a href="<c:url value='/update-feedback/${feedback.f_id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href = "addfeedback">add new feedback</a>
</body>
</html>