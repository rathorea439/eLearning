<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
		#mybtn{
				  padding: 20px;
				  border: none;
				  background: dodgerblue;
				  color: #fff;
				  cursor: pointer;
				  border-radius: 12px;
				  font-size:20px;
		}
	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin data</title>
</head>
<body>

<%-- <table border="1">
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Email</th>
			<th>Address</th>
			<th>Actions</th>
		</tr>

		<c:forEach var="admin" items="${list }">
			<tr>
				<td>${admin.admin_id }</td>
				<td>${admin.name }</td>
				<td>${admin.email }</td>
				<td>${admin.password }</td>
				<td><a href="<c:url value='/delete-admin/${admin.admin_id }'/>">Delete</a>
					| <a href="<c:url value='/update-admin/${admin.admin_id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href = "addadmin">add new admin</a> --%>
	<div style="margin: 0px auto;padding: 100px; margin-left: 10%;">
	<a href="feedback-list">
		<button id="mybtn">Feedback</button>
	</a>
	<a href="course-list">
		<button id="mybtn">Course</button>
	</a>
	<a href="user-list">
		<button id="mybtn">User</button>
	</a>
	<a href="contact-list">
		<button id="mybtn">Contacts</button>
	</a>
</div>
	<!-- <a href = "feedback-list">feedback list</a>
	<a href = "course-list">course list</a> -->
</body>
</html>