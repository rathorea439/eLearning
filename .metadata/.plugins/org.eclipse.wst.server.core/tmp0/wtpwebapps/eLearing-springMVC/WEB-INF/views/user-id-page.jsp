<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<title>User id page</title>
</head>
<body>
<h2>Welcome User</h2>
<div style="margin: 0px auto;padding: 100px; margin-left: 10%;">
	<a href="view-course">
		<button id="mybtn">View all courses</button>
	</a>
	<a href="give-feedback">
		<button id="mybtn">Give Feedback</button>
	</a>
	
</div>
</body>
</html>