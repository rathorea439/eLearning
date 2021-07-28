<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User data</title>
</head>
<body>


<table border="1">
		<tr>
			<th>User ID</th>
			<th>User name</th>
			<th>User phone_no</th>
			<th>User email</th>
			<th>User address</th>
			<th>User reg_date</th>
			<th>User password</th>
			<th>User photo</th>
			<th>Actions</th>
		</tr>

		<c:forEach var="user" items="${list }">
			<tr>
				<td>${user.user_id }</td>
				<td>${user.name }</td>
				<td>${user.phone_no }</td>
				<td>${user.email }</td>
				<td>${user.address }</td>
				<td>${user.reg_date }</td>
				<td>${user.password }</td>
				<td>${user.upload_photo }</td>
				
				<td><a href="<c:url value='/delete-user/${user.user_id }'/>">Delete</a>
					| <a href="<c:url value='/update-user/${user.user_id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href = "adduser">add new user</a>
	<a href = "course-list"> course</a>
</body>
</html>